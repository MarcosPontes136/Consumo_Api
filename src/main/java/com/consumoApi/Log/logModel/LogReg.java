package com.consumoApi.Log.logModel;

public class LogReg {

	private String id; 
	
	private String data_hora; 
	
	private String car_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData_hora() {
		return data_hora;
	}

	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}

	public String getCar_id() {
		return car_id;
	}

	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}

	public LogReg(String id, String data_hora, String car_id) {
		this.id = id;
		this.data_hora = data_hora;
		this.car_id = car_id;
	}

	public LogReg() {
	}
	
	
}
