package com.cts.pss.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

	@Id
	@GeneratedValue
	@Column(name = "inv_id")
	protected long id;
	protected int count;

	public Inventory() {

	}

	public Inventory(long id, int count) {
		super();
		this.id = id;
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Inventory other = (Inventory) obj;
		if (count != other.count)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	/*
	 * public Inventory(long id, int count, Flight flight) { super(); this.id = id;
	 * this.count = count; this.flight = flight; }
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	/*
	 * public Flight getFlight() { return flight; }
	 * 
	 * public void setFlight(Flight flight) { this.flight = flight; }
	 */

}
