package com.datcompany.controller;

import org.springframework.web.bind.annotation.RestController;

import com.datcompany.model.Account;
import com.datcompany.service.AccountService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@AllArgsConstructor
public class AccountController {
  final private AccountService accountService;

  @GetMapping("/accounts")
  public List<Account> getMethodName() {
    return accountService.findAllAccounts();
  }
}
