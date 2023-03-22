package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.service.impl.HelloWorldService;

@RestController
@RequestMapping("world")
public class WorldController {

	@Autowired
	HelloWorldService worldService;

	@GetMapping(value = "/hello")
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity<String>(worldService.getMessage(), HttpStatus.OK);
	}
}
