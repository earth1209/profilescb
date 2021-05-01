package com.present.profile.book.controllor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookControllor {
	
	
	
	
	@GetMapping("/book")
	public ResponseEntity<String> list(){
		 
	RestTemplate restTemplate = new RestTemplate();
    final String baseUrl = "https://scb-test-book-publisher.herokuapp.com/books";
		 ResponseEntity<String> result = restTemplate.getForEntity(baseUrl, String.class);
	   
	     return result;
	}
}
