package com.tqi.developer.resorce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tqi.developer.entities.State;
import com.tqi.developer.service.StateService;

@RestController
@RequestMapping(name = "/states")
public class StateResorce {
	
	@Autowired
	private StateService service;
	
	public ResponseEntity<Page<State>> list(Pageable page){
		Page<State> obj = service.list(page);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
	
}
