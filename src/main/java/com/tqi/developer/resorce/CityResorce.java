package com.tqi.developer.resorce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tqi.developer.entities.City;
import com.tqi.developer.service.CityService;


@RestController
@RequestMapping(value = "/cities")
public class CityResorce {
    @Autowired 
	private CityService service;
	
    @GetMapping
    public ResponseEntity<List<City>> findAll(){
    	List<City> obj = service.findAll();
    	return ResponseEntity.ok().body(obj);
    }
	
	
}
