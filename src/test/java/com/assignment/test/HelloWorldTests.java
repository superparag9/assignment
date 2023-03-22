package com.assignment.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.assignment.service.impl.HelloWorldService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class HelloWorldTests {

	@Mock
	HelloWorldService worldService;

	@Test
	public void whenNumberIsDivisibleBy3() {
		Mockito.when(worldService.getMessage()).thenReturn("Hello");
		String message = worldService.getMessage();
		Assert.assertEquals("Hello", message);
	}

	@Test
	public void whenNumberIsDivisibleBy5() {
		Mockito.when(worldService.getMessage()).thenReturn("World");
		String message = worldService.getMessage();
		Assert.assertEquals("World", message);
	}

	@Test
	public void whenNumberIsDivisibleBy3And5() {
		Mockito.when(worldService.getMessage()).thenReturn("Hello World");
		String message = worldService.getMessage();
		Assert.assertEquals("Hello World", message);
	}

}
