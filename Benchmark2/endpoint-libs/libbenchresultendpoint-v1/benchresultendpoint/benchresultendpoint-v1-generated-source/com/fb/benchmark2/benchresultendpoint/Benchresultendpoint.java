/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-12-19 23:55:21 UTC)
 * on 2014-01-27 at 11:35:44 UTC 
 * Modify at your own risk.
 */

package com.fb.benchmark2.benchresultendpoint;

/**
 * Service definition for Benchresultendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link BenchresultendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Benchresultendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the benchresultendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://mimetic-pursuit-419.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "benchresultendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Benchresultendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Benchresultendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getBenchResult".
   *
   * This request holds the parameters needed by the the benchresultendpoint server.  After setting
   * any optional parameters, call the {@link GetBenchResult#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetBenchResult getBenchResult(java.lang.Long id) throws java.io.IOException {
    GetBenchResult result = new GetBenchResult(id);
    initialize(result);
    return result;
  }

  public class GetBenchResult extends BenchresultendpointRequest<com.fb.benchmark2.benchresultendpoint.model.BenchResult> {

    private static final String REST_PATH = "benchresult/{id}";

    /**
     * Create a request for the method "getBenchResult".
     *
     * This request holds the parameters needed by the the benchresultendpoint server.  After setting
     * any optional parameters, call the {@link GetBenchResult#execute()} method to invoke the remote
     * operation. <p> {@link GetBenchResult#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetBenchResult(java.lang.Long id) {
      super(Benchresultendpoint.this, "GET", REST_PATH, null, com.fb.benchmark2.benchresultendpoint.model.BenchResult.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetBenchResult setAlt(java.lang.String alt) {
      return (GetBenchResult) super.setAlt(alt);
    }

    @Override
    public GetBenchResult setFields(java.lang.String fields) {
      return (GetBenchResult) super.setFields(fields);
    }

    @Override
    public GetBenchResult setKey(java.lang.String key) {
      return (GetBenchResult) super.setKey(key);
    }

    @Override
    public GetBenchResult setOauthToken(java.lang.String oauthToken) {
      return (GetBenchResult) super.setOauthToken(oauthToken);
    }

    @Override
    public GetBenchResult setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetBenchResult) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetBenchResult setQuotaUser(java.lang.String quotaUser) {
      return (GetBenchResult) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetBenchResult setUserIp(java.lang.String userIp) {
      return (GetBenchResult) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetBenchResult setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetBenchResult set(String parameterName, Object value) {
      return (GetBenchResult) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertBenchResult".
   *
   * This request holds the parameters needed by the the benchresultendpoint server.  After setting
   * any optional parameters, call the {@link InsertBenchResult#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.fb.benchmark2.benchresultendpoint.model.BenchResult}
   * @return the request
   */
  public InsertBenchResult insertBenchResult(com.fb.benchmark2.benchresultendpoint.model.BenchResult content) throws java.io.IOException {
    InsertBenchResult result = new InsertBenchResult(content);
    initialize(result);
    return result;
  }

  public class InsertBenchResult extends BenchresultendpointRequest<com.fb.benchmark2.benchresultendpoint.model.BenchResult> {

    private static final String REST_PATH = "benchresult";

    /**
     * Create a request for the method "insertBenchResult".
     *
     * This request holds the parameters needed by the the benchresultendpoint server.  After setting
     * any optional parameters, call the {@link InsertBenchResult#execute()} method to invoke the
     * remote operation. <p> {@link InsertBenchResult#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.fb.benchmark2.benchresultendpoint.model.BenchResult}
     * @since 1.13
     */
    protected InsertBenchResult(com.fb.benchmark2.benchresultendpoint.model.BenchResult content) {
      super(Benchresultendpoint.this, "POST", REST_PATH, content, com.fb.benchmark2.benchresultendpoint.model.BenchResult.class);
    }

    @Override
    public InsertBenchResult setAlt(java.lang.String alt) {
      return (InsertBenchResult) super.setAlt(alt);
    }

    @Override
    public InsertBenchResult setFields(java.lang.String fields) {
      return (InsertBenchResult) super.setFields(fields);
    }

    @Override
    public InsertBenchResult setKey(java.lang.String key) {
      return (InsertBenchResult) super.setKey(key);
    }

    @Override
    public InsertBenchResult setOauthToken(java.lang.String oauthToken) {
      return (InsertBenchResult) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertBenchResult setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertBenchResult) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertBenchResult setQuotaUser(java.lang.String quotaUser) {
      return (InsertBenchResult) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertBenchResult setUserIp(java.lang.String userIp) {
      return (InsertBenchResult) super.setUserIp(userIp);
    }

    @Override
    public InsertBenchResult set(String parameterName, Object value) {
      return (InsertBenchResult) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listBenchResult".
   *
   * This request holds the parameters needed by the the benchresultendpoint server.  After setting
   * any optional parameters, call the {@link ListBenchResult#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListBenchResult listBenchResult() throws java.io.IOException {
    ListBenchResult result = new ListBenchResult();
    initialize(result);
    return result;
  }

  public class ListBenchResult extends BenchresultendpointRequest<com.fb.benchmark2.benchresultendpoint.model.CollectionResponseBenchResult> {

    private static final String REST_PATH = "benchresult";

    /**
     * Create a request for the method "listBenchResult".
     *
     * This request holds the parameters needed by the the benchresultendpoint server.  After setting
     * any optional parameters, call the {@link ListBenchResult#execute()} method to invoke the remote
     * operation. <p> {@link ListBenchResult#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListBenchResult() {
      super(Benchresultendpoint.this, "GET", REST_PATH, null, com.fb.benchmark2.benchresultendpoint.model.CollectionResponseBenchResult.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListBenchResult setAlt(java.lang.String alt) {
      return (ListBenchResult) super.setAlt(alt);
    }

    @Override
    public ListBenchResult setFields(java.lang.String fields) {
      return (ListBenchResult) super.setFields(fields);
    }

    @Override
    public ListBenchResult setKey(java.lang.String key) {
      return (ListBenchResult) super.setKey(key);
    }

    @Override
    public ListBenchResult setOauthToken(java.lang.String oauthToken) {
      return (ListBenchResult) super.setOauthToken(oauthToken);
    }

    @Override
    public ListBenchResult setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListBenchResult) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListBenchResult setQuotaUser(java.lang.String quotaUser) {
      return (ListBenchResult) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListBenchResult setUserIp(java.lang.String userIp) {
      return (ListBenchResult) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListBenchResult setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListBenchResult setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListBenchResult set(String parameterName, Object value) {
      return (ListBenchResult) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeBenchResult".
   *
   * This request holds the parameters needed by the the benchresultendpoint server.  After setting
   * any optional parameters, call the {@link RemoveBenchResult#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveBenchResult removeBenchResult(java.lang.Long id) throws java.io.IOException {
    RemoveBenchResult result = new RemoveBenchResult(id);
    initialize(result);
    return result;
  }

  public class RemoveBenchResult extends BenchresultendpointRequest<Void> {

    private static final String REST_PATH = "benchresult/{id}";

    /**
     * Create a request for the method "removeBenchResult".
     *
     * This request holds the parameters needed by the the benchresultendpoint server.  After setting
     * any optional parameters, call the {@link RemoveBenchResult#execute()} method to invoke the
     * remote operation. <p> {@link RemoveBenchResult#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveBenchResult(java.lang.Long id) {
      super(Benchresultendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveBenchResult setAlt(java.lang.String alt) {
      return (RemoveBenchResult) super.setAlt(alt);
    }

    @Override
    public RemoveBenchResult setFields(java.lang.String fields) {
      return (RemoveBenchResult) super.setFields(fields);
    }

    @Override
    public RemoveBenchResult setKey(java.lang.String key) {
      return (RemoveBenchResult) super.setKey(key);
    }

    @Override
    public RemoveBenchResult setOauthToken(java.lang.String oauthToken) {
      return (RemoveBenchResult) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveBenchResult setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveBenchResult) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveBenchResult setQuotaUser(java.lang.String quotaUser) {
      return (RemoveBenchResult) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveBenchResult setUserIp(java.lang.String userIp) {
      return (RemoveBenchResult) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveBenchResult setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveBenchResult set(String parameterName, Object value) {
      return (RemoveBenchResult) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateBenchResult".
   *
   * This request holds the parameters needed by the the benchresultendpoint server.  After setting
   * any optional parameters, call the {@link UpdateBenchResult#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.fb.benchmark2.benchresultendpoint.model.BenchResult}
   * @return the request
   */
  public UpdateBenchResult updateBenchResult(com.fb.benchmark2.benchresultendpoint.model.BenchResult content) throws java.io.IOException {
    UpdateBenchResult result = new UpdateBenchResult(content);
    initialize(result);
    return result;
  }

  public class UpdateBenchResult extends BenchresultendpointRequest<com.fb.benchmark2.benchresultendpoint.model.BenchResult> {

    private static final String REST_PATH = "benchresult";

    /**
     * Create a request for the method "updateBenchResult".
     *
     * This request holds the parameters needed by the the benchresultendpoint server.  After setting
     * any optional parameters, call the {@link UpdateBenchResult#execute()} method to invoke the
     * remote operation. <p> {@link UpdateBenchResult#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.fb.benchmark2.benchresultendpoint.model.BenchResult}
     * @since 1.13
     */
    protected UpdateBenchResult(com.fb.benchmark2.benchresultendpoint.model.BenchResult content) {
      super(Benchresultendpoint.this, "PUT", REST_PATH, content, com.fb.benchmark2.benchresultendpoint.model.BenchResult.class);
    }

    @Override
    public UpdateBenchResult setAlt(java.lang.String alt) {
      return (UpdateBenchResult) super.setAlt(alt);
    }

    @Override
    public UpdateBenchResult setFields(java.lang.String fields) {
      return (UpdateBenchResult) super.setFields(fields);
    }

    @Override
    public UpdateBenchResult setKey(java.lang.String key) {
      return (UpdateBenchResult) super.setKey(key);
    }

    @Override
    public UpdateBenchResult setOauthToken(java.lang.String oauthToken) {
      return (UpdateBenchResult) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateBenchResult setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateBenchResult) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateBenchResult setQuotaUser(java.lang.String quotaUser) {
      return (UpdateBenchResult) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateBenchResult setUserIp(java.lang.String userIp) {
      return (UpdateBenchResult) super.setUserIp(userIp);
    }

    @Override
    public UpdateBenchResult set(String parameterName, Object value) {
      return (UpdateBenchResult) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Benchresultendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Benchresultendpoint}. */
    @Override
    public Benchresultendpoint build() {
      return new Benchresultendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link BenchresultendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setBenchresultendpointRequestInitializer(
        BenchresultendpointRequestInitializer benchresultendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(benchresultendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
