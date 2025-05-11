package com.datcompany.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.datcompany.model.Ingredient;
import com.datcompany.model.Taco;
import com.datcompany.model.Ingredient.Type;

// when add Request mapping like this on class level means you call api start from /design
@RequestMapping("/design")
@Controller
@SessionAttributes("tacoOrder")
public class DesignTacoController {
  private static final Logger log = LoggerFactory.getLogger(DesignTacoController.class);

  public void addIngredientsTomodel(Model model) {
    List<Ingredient> ingredients = Arrays.asList(
        new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
        new Ingredient("CoTo", "Corn Tortilla", Type.WRAP),
        new Ingredient("GRBE", "Ground Beef", Type.PROTEIN));

    Type[] types = Ingredient.Type.values();
    for (Type type : types) {
      model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
    }
  }

  @GetMapping
  public String showDesignForm(Model model) {
    model.addAttribute("taco", new Taco());

    return "design";
  }

  private Iterable<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
    return ingredients
        .stream()
        .filter(x -> x.getType().equals(type))
        .collect(Collectors.toList());
  }
}

