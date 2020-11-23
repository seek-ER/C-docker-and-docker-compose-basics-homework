package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

  @GetMapping("/hello")
  @ResponseStatus(HttpStatus.OK)
  public String hello(){
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> entity = restTemplate.getForEntity("http://bob:8081/hello", String.class);
    return entity.getBody();
  }
}
