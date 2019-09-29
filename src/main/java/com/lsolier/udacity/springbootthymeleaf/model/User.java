package com.lsolier.udacity.springbootthymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

  private Integer Id;
  private String name;
  private Boolean isActive;

}
