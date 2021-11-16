package com.tqi.developer.resorce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tqi.developer.entities.State;
import com.tqi.developer.service.StateService;

@RestController
@RequestMapping(value = "/states")
public class StateResorce {
	
	@Autowired
	private StateService service;
	
	@GetMapping
	public ResponseEntity<List<State>> findAll(){
		List<State> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/pag")
	public ResponseEntity<Page<State>> list(Pageable page){
		Page<State> obj = service.list(page);
		return ResponseEntity.ok(obj);
	}
	
	
	
	
	
}
