package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entities.Passenger;

public interface PassengerDAO extends JpaRepository<Passenger, Integer> {

}
