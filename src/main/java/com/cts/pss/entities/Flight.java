package com.cts.pss.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight  {
	
	@Id
	@GeneratedValue
	protected long id;
	protected String destination;
	protected String duration;
	@Column(name = "flight_number")
	protected String flightNumber;
	@Column(name = "flight_date")
	protected LocalDate flightDate;
	protected String origin;
	@Column(name = "flight_time")
	protected LocalTime flightTime;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "fare_id")
	protected Fare fare;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "inv_id")
	protected Inventory inv;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "flight_infoid")
	protected FlightInfo info;
	
	
	public Flight() {
	}
	
	
	public Flight(long id, String destination, String duration, String flightNumber, LocalDate flightDate,
			String origin, LocalTime flightTime, Fare fare, Inventory inv, FlightInfo info) {
		super();
		this.id = id;
		this.destination = destination;
		this.duration = duration;
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.origin = origin;
		this.flightTime = flightTime;
		this.fare = fare;
		this.inv = inv;
		this.info = info;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((fare == null) ? 0 : fare.hashCode());
		result = prime * result + ((flightDate == null) ? 0 : flightDate.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result + ((flightTime == null) ? 0 : flightTime.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result + ((inv == null) ? 0 : inv.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
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
		Flight other = (Flight) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (fare == null) {
			if (other.fare != null)
				return false;
		} else if (!fare.equals(other.fare))
			return false;
		if (flightDate == null) {
			if (other.flightDate != null)
				return false;
		} else if (!flightDate.equals(other.flightDate))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (flightTime == null) {
			if (other.flightTime != null)
				return false;
		} else if (!flightTime.equals(other.flightTime))
			return false;
		if (id != other.id)
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		if (inv == null) {
			if (other.inv != null)
				return false;
		} else if (!inv.equals(other.inv))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public LocalDate getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public LocalTime getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(LocalTime flightTime) {
		this.flightTime = flightTime;
	}
	public Fare getFare() {
		return fare;
	}
	public void setFare(Fare fare) {
		this.fare = fare;
	}
	public Inventory getInv() {
		return inv;
	}
	public void setInv(Inventory inv) {
		this.inv = inv;
	}
	public FlightInfo getInfo() {
		return info;
	}
	public void setInfo(FlightInfo info) {
		this.info = info;
	}
	/*
	 * public static long getSerialversionuid() { return serialVersionUID; }
	 */
}
