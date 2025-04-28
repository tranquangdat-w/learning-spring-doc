package com.datcompany.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import lombok.AllArgsConstructor;


@Configuration
@AllArgsConstructor
public class ProjectConfig {
  private final Environment env;

  @Bean
  public TestBean testBean() {
    TestBean rs = new TestBean(env.getProperty("bean.name"));
    return rs;
  }
}

