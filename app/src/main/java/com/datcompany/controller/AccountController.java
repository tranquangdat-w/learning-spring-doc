package com.datcompany.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datcompany.model.Account;


@RestController
public class AccountController {
  @GetMapping("/test")
  public Account test() {
    return new Account();
  }
}
