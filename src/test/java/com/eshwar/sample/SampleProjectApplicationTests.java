package com.eshwar.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleProjectApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;


	@Test
	public void contextLoads() {

	}

	@Test
	public void method(){

      ResponseEntity<String> response =  restTemplate.getForEntity("/sample/subject/10", String.class);

      System.out.print("response is : " + response.getBody());
	}


}
