package com.cts.pss.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flight_info")
public class FlightInfo {
	@Id
	@GeneratedValue
	@Column(name = "flight_infoid")
	protected long id;
	@Column(name = "flight_number")
	protected String flightNumber;
	@Column(name = "flight_type")
	protected String flightType;
	@Column(name = "numberof_seats")
	protected int numberofSeats;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="flights_info",joinColumns= {@JoinColumn(name="flight_infoid")},
	inverseJoinColumns= {@JoinColumn(name="airline_id")})
	protected AirlineInfo airLineInfo;

	public FlightInfo() {

	}

	public FlightInfo(long id, String flightNumber, String flightType, int numberofSeats, AirlineInfo airLineInfo) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.flightType = flightType;
		this.numberofSeats = numberofSeats;
		this.airLineInfo = airLineInfo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airLineInfo == null) ? 0 : airLineInfo.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result + ((flightType == null) ? 0 : flightType.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + numberofSeats;
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
		FlightInfo other = (FlightInfo) obj;
		if (airLineInfo == null) {
			if (other.airLineInfo != null)
				return false;
		} else if (!airLineInfo.equals(other.airLineInfo))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (flightType == null) {
			if (other.flightType != null)
				return false;
		} else if (!flightType.equals(other.flightType))
			return false;
		if (id != other.id)
			return false;
		if (numberofSeats != other.numberofSeats)
			return false;
		return true;
	}


	public AirlineInfo getAirLineInfo() {
		return airLineInfo;
	}

	public void setAirLineInfo(AirlineInfo airLineInfo) {
		this.airLineInfo = airLineInfo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public int getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}
	/*
	 * public Flight getFlight() { return flight; }
	 * 
	 * public void setFlight(Flight flight) { this.flight = flight; }
	 */
}
