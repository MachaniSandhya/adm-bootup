package com.cts.pss.dto;

public class Search {
	private String origin;
	private String destination;
	private String date;
	private String time;
	private String flightnum;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFlightnum() {
		return flightnum;
	}

	public void setFlightnum(String flightnum) {
		this.flightnum = flightnum;
	}

	@Override
	public String toString() {
		return "Search [origin=" + origin + ", destination=" + destination + ", date=" + date + ", time=" + time
				+ ", flightnum=" + flightnum + "]";
	}
	

}