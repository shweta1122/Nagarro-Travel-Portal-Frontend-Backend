package com.nagarro.sweta.employeetravelmanagement.repository;

import java.util.List;

import com.nagarro.sweta.employeetravelmanagement.model.Hotel;

import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<Hotel, Long> {

    List<Hotel> findByName(String name);
}