package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entities.BookingRecord;

public interface BookingRecordDAO extends JpaRepository<BookingRecord, Integer>{

}
