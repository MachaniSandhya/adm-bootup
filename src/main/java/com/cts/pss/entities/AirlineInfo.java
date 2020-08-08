package com.cts.pss.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airline_info")
public class AirlineInfo {

	@Id
	@GeneratedValue
	@Column(name = "airline_id")
	protected long id;
	@Column(name = "airline_logo")
	protected String logo;
	@Column(name = "name_of_airline")
	protected String airlineName;

	public AirlineInfo() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlineName == null) ? 0 : airlineName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((logo == null) ? 0 : logo.hashCode());
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
		AirlineInfo other = (AirlineInfo) obj;
		if (airlineName == null) {
			if (other.airlineName != null)
				return false;
		} else if (!airlineName.equals(other.airlineName))
			return false;
		if (id != other.id)
			return false;
		if (logo == null) {
			if (other.logo != null)
				return false;
		} else if (!logo.equals(other.logo))
			return false;
		return true;
	}

	/*
	 * public Set<FlightInfo> getFlightInfo() { return flightInfo; }
	 * 
	 * public void setFlightInfo(Set<FlightInfo> flightInfo) { this.flightInfo =
	 * flightInfo; }
	 */

	/*
	 * public static long getSerialversionuid() { return serialVersionUID; }
	 */

}
