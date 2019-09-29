package com.lsolier.udacity.springbootthymeleaf.controller;

import com.lsolier.udacity.springbootthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

  @RequestMapping("/demo")
  public String demo(Model model) {
    model.addAttribute("message", "Hello from Thymeleaf");
    double grade = 90.5;
    model.addAttribute("grade", grade);
    model.addAttribute("GPA", convertGPA(grade));
    return "demo";
  }

  @RequestMapping("/loop")
  public String loop(Model model) {
    List<User> list = new ArrayList<>();
    list.add(new User(1,"Luis", true));
    list.add(new User(1,"Diana", true));
    list.add(new User(1,"Maycol", false));
    list.add(new User(1,"Nick", false));
    model.addAttribute("list", list);
    return "loop";
  }

  @RequestMapping("/scope")
  public String scope(HttpServletRequest request, Model model) {
    //Request
    request.setAttribute("request", "request data");
    //Session
    request.getSession().setAttribute("session", "session data");
    //Application
    request.getSession().getServletContext().setAttribute("application", "application data");
    return "scope";
  }

  private String convertGPA(double grade) {
    if (grade >= 90) {
      return "A";
    } else if (grade < 90 && grade >= 80) {
      return "B";
    } else if (grade < 80 && grade >= 70) {
      return "C";
    } else if (grade < 70 && grade >= 60) {
      return "D";
    } else {
      return "F";
    }
  }
}
