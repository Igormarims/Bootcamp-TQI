package com.tqi.java.developer.resorce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tqi.java.developer.entities.Country;
import com.tqi.java.developer.service.CountryService;

@RestController
@RequestMapping(value = "/countries")
public class CountryResoucer {

	@Autowired
	private CountryService service;
	
	@GetMapping
	public ResponseEntity<List <Country>> findAll(){
		List<Country> country = service.findAll();
		return ResponseEntity.ok().body(country);
	}
	
	@GetMapping(value = "/pag")
	public ResponseEntity<Page<Country>> list(Pageable pageable){
		Page<Country> pag = service.list(pageable);
		return ResponseEntity.ok(pag);
	}
	
	@GetMapping(value = "/{id}" )
	public ResponseEntity<Country> findById(@PathVariable Long id) {
		Country country = service.finById(id);
		return ResponseEntity.ok().body(country);
		
	}
}
