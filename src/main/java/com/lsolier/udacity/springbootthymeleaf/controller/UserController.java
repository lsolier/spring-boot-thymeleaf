package com.lsolier.udacity.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

  @RequestMapping("/demo")
  public String demo(Model model) {
    model.addAttribute("message", "Hello from Thymeleaf");
    return "demo";
  }
}