package com.fb.benchmark2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class BenchResult {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key key;
	private String deviceName;
	private String deviceCPU;
	private String deviceGPU;
	private String deviceRAM;
	private int deviceResult;
	
	public Key getKey()
	{
		return key;
	}
	public void clearKey()
	{
		key = null;
	}
	
	public int getDeviceResult() {
		return deviceResult;
	}
	public void setDeviceResult(int deviceResult) {
		this.deviceResult = deviceResult;
	}
	public String getDeviceRAM() {
		return deviceRAM;
	}
	public void setDeviceRAM(String deviceRAM) {
		this.deviceRAM = deviceRAM;
	}
	public String getDeviceCPU() {
		return deviceCPU;
	}
	public void setDeviceCPU(String deviceCPU) {
		this.deviceCPU = deviceCPU;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceGPU() {
		return deviceGPU;
	}
	public void setDeviceGPU(String deviceGPU) {
		this.deviceGPU = deviceGPU;
	}

}