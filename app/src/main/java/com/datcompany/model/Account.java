package com.datcompany.model;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {
  private UUID id;
  private String userName; 
  private String email;
  private String password;
  private int age;
  private Date createAt;
  private Date updateAt;
}

