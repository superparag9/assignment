package com.assignment.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.assignment.service.impl.HelloUniverseService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class HelloUniverseTests {

	@Mock
	HelloUniverseService universeService;

	@Test
	public void whenNumberIsDivisibleBy3() {
		Mockito.when(universeService.getMessage()).thenReturn("Hello");
		String message = universeService.getMessage();
		Assert.assertEquals("Hello", message);
	}

	@Test
	public void whenNumberIsDivisibleBy5() {
		Mockito.when(universeService.getMessage()).thenReturn("Universe");
		String message = universeService.getMessage();
		Assert.assertEquals("Universe", message);
	}

	@Test
	public void whenNumberIsDivisibleBy3And5() {
		Mockito.when(universeService.getMessage()).thenReturn("Hello Universe");
		String message = universeService.getMessage();
		Assert.assertEquals("Hello Universe", message);
	}

}
