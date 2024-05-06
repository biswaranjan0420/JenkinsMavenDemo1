package com.example.JenkinsMavenDemo1;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

	Logger logger = LoggerFactory.getLogger(HellowController.class);

	
	@GetMapping("/userinfo")
	public ResponseEntity<Map<String, String>> test() {
		logger.info("Reading user Data started");
		Map<String, String> data = readMapData();
		logger.info("Reading user Data with name ?", data.get("name"));
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	private Map<String, String> readMapData() {
		try {
			FileInputStream fis = new FileInputStream("/abcs.txt");
			fis.available();
		} catch (Exception e) {

		}
		Map<String, String> map = new HashMap<>();
		map.put("name", "Biswaranjan");
		map.put("age", "36");
		map.put("gender", "M");
		map.put("Hi", "Hellow");
		return map;
	}
}
