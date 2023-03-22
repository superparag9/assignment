package com.assignment.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.assignment.service.IMessageService;

@Service
public class HelloWorldService implements IMessageService {

	@Value("${number.start}")
	private int startNumber;

	@Value("${number.end}")
	private int endNumber;

	@Override
	public String getMessage() {
		String output = "";
		for (int i = startNumber; i <= endNumber; i++) {
			int no1 = i % 3;
			int no2 = i % 5;

			if (no1 == 0) {
				output = output + "Hello";
			} else if (no2 == 0) {
				output = output + "World";
			} else if (no1 == 0 && no2 == 0) {
				output = output + "Hello World";
			} else {
				output = output + i;
			}
		}

		return output;
	}

}
