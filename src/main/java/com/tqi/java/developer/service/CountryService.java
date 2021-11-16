package com.tqi.java.developer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tqi.java.developer.entities.Country;
import com.tqi.java.developer.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository repository;
	
	
	public List<Country> findAll(){
		return repository.findAll();
		
	}
	
	public Page<Country> list(Pageable pageable){
		Page<Country> pagina = repository.findAll(pageable);
		return pagina;
	}
	
	public Country finById(Long id){
		Optional<Country> country = repository.findById(id);
		return country.get();
		
	}
	
}
