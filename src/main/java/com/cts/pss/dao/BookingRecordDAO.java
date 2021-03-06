package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entities.BookingRecord;
import com.cts.pss.entities.Flight;

public interface BookingRecordDAO extends JpaRepository<BookingRecord, Integer>{
	public BookingRecord findBookingRecordById(long id);
}
