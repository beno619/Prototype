package com.fidelb.benchmark;

import com.fidelb.benchmark.EMF;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JPACursorHelper;

import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "benchresultendpoint", namespace = @ApiNamespace(ownerDomain = "fidelb.com", ownerName = "fidelb.com", packagePath = "benchmark"))
public class BenchResultEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listBenchResult")
	public CollectionResponse<BenchResult> listBenchResult(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<BenchResult> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr
					.createQuery("select from BenchResult as BenchResult");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<BenchResult>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (BenchResult obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<BenchResult> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getBenchResult")
	public BenchResult getBenchResult(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		BenchResult benchresult = null;
		try {
			benchresult = mgr.find(BenchResult.class, id);
		} finally {
			mgr.close();
		}
		return benchresult;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param benchresult the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertBenchResult")
	public BenchResult insertBenchResult(BenchResult benchresult) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsBenchResult(benchresult)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(benchresult);
		} finally {
			mgr.close();
		}
		return benchresult;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param benchresult the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateBenchResult")
	public BenchResult updateBenchResult(BenchResult benchresult) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsBenchResult(benchresult)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(benchresult);
		} finally {
			mgr.close();
		}
		return benchresult;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeBenchResult")
	public void removeBenchResult(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			BenchResult benchresult = mgr.find(BenchResult.class, id);
			mgr.remove(benchresult);
		} finally {
			mgr.close();
		}
	}

	private boolean containsBenchResult(BenchResult benchresult) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			BenchResult item = mgr
					.find(BenchResult.class, benchresult.getKey());
			if (item == null) {
				contains = false;
			}
		} finally {
			mgr.close();
		}
		return contains;
	}

	private static EntityManager getEntityManager() {
		return EMF.get().createEntityManager();
	}

}
