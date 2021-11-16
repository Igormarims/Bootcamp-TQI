package com.tqi.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tqi.developer.entities.City;
@Service
public class CityService {
	
	@Autowired
	private CityService repository;
	
	
	public List<City> findAll(){
		return	repository.findAll();
			
		}
		
		
		public Page<City> list(Pageable page){
			Page<City> pag = repository.list(page);
			return pag;
			
		}
		
	
	

}
