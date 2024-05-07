package com.example.JenkinsMavenDemo1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

public class HellowControllerTest {
	
	private HellowController hellowController;
	@BeforeEach
	public void init() {
		hellowController = new HellowController();
		System.out.println("HellowController Initialized!");
	}
	
	@Test
	public void test1(){
		ResponseEntity<Map<String, String>> data = hellowController.test();
		Map<String, String> actualdata = data.getBody();
		assertNotNull(actualdata);
		assertEquals("Biswaranjan", actualdata.get("name"));
		assertEquals("36", actualdata.get("age"));
	}

}
