package com.example.demo.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cab 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cabId;
	private String cabModel;
	private String cabNumber;
	private String DriverName;
	private String driverNumber;
	
	public Cab(Integer cabId, String cabModel, String cabNumber, String driverName, String driverNumber) {
		this.cabId = cabId;
		this.cabModel = cabModel;
		this.cabNumber = cabNumber;
		DriverName = driverName;
		this.driverNumber = driverNumber;
	}
	
	public Integer getCabId() {
		return cabId;
	}
	
	public void setCabId(Integer cabId) {
		this.cabId = cabId;
	}
	
	public String getCabModel() {
		return cabModel;
	}
	
	public void setCabModel(String cabModel) {
		this.cabModel = cabModel;
	}
	
	public String getCabNumber() {
		return cabNumber;
	}
	
	public void setCabNumber(String cabNumber) {
		this.cabNumber = cabNumber;
	}
	
	public String getDriverName() {
		return DriverName;
	}
	
	public void setDriverName(String driverName) {
		DriverName = driverName;
	}
	
	public String getDriverNumber() {
		return driverNumber;
	}
	
	public void setDriverNumber(String driverNumber) {
		this.driverNumber = driverNumber;
	}
	
	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", cabModel=" + cabModel + ", cabNumber=" + cabNumber + ", DriverName="
				+ DriverName + ", driverNumber=" + driverNumber + "]";
	}
}
