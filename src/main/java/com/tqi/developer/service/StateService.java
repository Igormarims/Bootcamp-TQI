package com.tqi.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tqi.developer.Repositoy.StateReposity;
import com.tqi.developer.entities.State;

@Service
public class StateService {
	
	@Autowired
	private StateReposity repository;
	
	public List<State> findAll(){
	return	repository.findAll();
		
	}
	
	
	public Page<State> list(Pageable page){
		Page<State> pag = repository.findAll(page);
		return pag;
		
	}
	
	

}
