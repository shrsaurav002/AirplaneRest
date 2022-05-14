package com.practice.airplane.store.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight_tbl")
public class FlightEntity {
	@Id
	@Column
	private String fid;
	@Column
	private String planeName;
	@Column
	private String depTime;
	@Column
	private String arrTime;
	@Column
	private String depCity;
	@Column
	private String arrCity;
	@Column
	private int seats;
	@Column
	private int price;

	@Override
	public String toString() {
		return "FlightEntity [fid=" + fid + ", planeName=" + planeName + ", depTime=" + depTime
				+ ", arrTime=" + arrTime + ", seats=" + seats + ", price=" + price + "]";
	}

	public FlightEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}


	public String getDepTime() {
		return depTime;
	}

	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}

	public String getArrTime() {
		return arrTime;
	}

	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}

	public String getDepCity() {
		return depCity;
	}

	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public String getArrCity() {
		return arrCity;
	}

	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public FlightEntity(String fid, String planeName,  String depTime, String arrTime, String depCity,
			String arrCity, int seats, int price) {
		super();
		this.fid = fid;
		this.planeName = planeName;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.depCity = depCity;
		this.arrCity = arrCity;
		this.seats = seats;
		this.price = price;
	}

}
