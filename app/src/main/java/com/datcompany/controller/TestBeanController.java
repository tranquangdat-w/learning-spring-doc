package com.datcompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datcompany.config.TestBean;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class TestBeanController {
  private final TestBean testbean;
  @GetMapping("/testbean")
  public TestBean getMethodName() {
    return this.testbean; 
  }
    
}

