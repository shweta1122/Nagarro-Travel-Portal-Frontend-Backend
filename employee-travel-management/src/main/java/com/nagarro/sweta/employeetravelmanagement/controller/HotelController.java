package com.nagarro.sweta.employeetravelmanagement.controller;

import java.util.LinkedList;
import java.util.List;

import javax.websocket.server.PathParam;

import com.nagarro.sweta.employeetravelmanagement.model.Hotel;
import com.nagarro.sweta.employeetravelmanagement.repository.HotelRepository;
import com.nagarro.sweta.employeetravelmanagement.viewmodel.HotelViewModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.var;

/**
 * hotels
 */
@RestController
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping
    public List<String> getAllHotels() {
        var arr = new LinkedList<String>();
        hotelRepository.findAll().forEach(x -> arr.add(x.getName()));
        return arr;
    }

    @GetMapping("{hotel}")
    public List<Hotel> getAllHotelsByName(@PathVariable("hotel") String hotel) {
        return hotelRepository.findByName(hotel);
    }

    @PostMapping(value = "/add")
    public String addHotel(@RequestBody HotelViewModel hotelVM) {
        var hotel = new Hotel();
        hotel.setName(hotelVM.getName());
        hotelRepository.save(hotel);
        return "ok";
        // ye porper way hokkkkk
        // wse ye saara kaam hume service class me krrna chahiye...but idhar hi
        // krrlothek
    }

    @PostMapping(value="test")
    public HotelViewModel stMethodName(@RequestBody HotelViewModel entity) {
        return entity;
    }
    

}// ek @request bdy v htana....haa wo add krrne ke liyeok