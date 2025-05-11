package com.datcompany.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.datcompany.model.Account;
import com.datcompany.repository.AccountRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountService {
  final private AccountRepository accountRepository;

  public List<Account> findAllAccounts() {
    accountRepository.findAllAccounts();
  }
}

