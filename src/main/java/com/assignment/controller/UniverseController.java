package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.service.impl.HelloUniverseService;

@RestController
@RequestMapping("universe")
public class UniverseController {
	@Autowired
	HelloUniverseService universeService;

	@GetMapping(value = "/hello")
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity<String>(universeService.getMessage(), HttpStatus.OK);
	}

}
