package com.example.hello;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class HelloApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void helloReturnsHello() {
		HelloController controller = new HelloController();
		assertEquals("Hello!", controller.hello());

	}
}
