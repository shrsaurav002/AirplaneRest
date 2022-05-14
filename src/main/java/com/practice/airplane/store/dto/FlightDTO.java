package com.practice.airplane.store.dto;

public class FlightDTO {
	private String fid;
	private String planeName;
	private String day;
	private String depTime;
	private String arrTime;
	private String depCity;
	private String arrCity;
	private int seats;
	private int price;

	public FlightDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightDTO(String fid, String planeName, String day, String depTime, String arrTime, String depCity,
			String arrCity, int seats, int price) {
		super();
		this.fid = fid;
		this.planeName = planeName;
		this.day = day;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.depCity = depCity;
		this.arrCity = arrCity;
		this.seats = seats;
		this.price = price;
	}

	@Override
	public String toString() {
		return "FlightDTO [fid=" + fid + ", planeName=" + planeName + ", day=" + day + ", depTime=" + depTime
				+ ", arrTime=" + arrTime + ", depCity=" + depCity + ", arrCity=" + arrCity + ", seats=" + seats
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrCity == null) ? 0 : arrCity.hashCode());
		result = prime * result + ((arrTime == null) ? 0 : arrTime.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((depCity == null) ? 0 : depCity.hashCode());
		result = prime * result + ((depTime == null) ? 0 : depTime.hashCode());
		result = prime * result + ((fid == null) ? 0 : fid.hashCode());
		result = prime * result + ((planeName == null) ? 0 : planeName.hashCode());
		result = prime * result + price;
		result = prime * result + seats;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightDTO other = (FlightDTO) obj;
		if (arrCity == null) {
			if (other.arrCity != null)
				return false;
		} else if (!arrCity.equals(other.arrCity))
			return false;
		if (arrTime == null) {
			if (other.arrTime != null)
				return false;
		} else if (!arrTime.equals(other.arrTime))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (depCity == null) {
			if (other.depCity != null)
				return false;
		} else if (!depCity.equals(other.depCity))
			return false;
		if (depTime == null) {
			if (other.depTime != null)
				return false;
		} else if (!depTime.equals(other.depTime))
			return false;
		if (fid == null) {
			if (other.fid != null)
				return false;
		} else if (!fid.equals(other.fid))
			return false;
		if (planeName == null) {
			if (other.planeName != null)
				return false;
		} else if (!planeName.equals(other.planeName))
			return false;
		if (price != other.price)
			return false;
		if (seats != other.seats)
			return false;
		return true;
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

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
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

}
