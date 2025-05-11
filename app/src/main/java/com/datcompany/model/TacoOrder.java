package com.datcompany.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TacoOrder {
  private String deliveryName;
  private String deliveryStreet;
  private String deliveryState;
  private String ccNumber;
  private String ccExpiration;
  private String toCVV;

  private List<Taco> tacos = new ArrayList<>();

  public void addTaco(Taco taco) {
    this.tacos.addLast(taco);
  }
}
