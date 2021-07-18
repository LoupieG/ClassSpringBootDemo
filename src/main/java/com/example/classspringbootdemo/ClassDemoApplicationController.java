package com.example.classspringbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassDemoApplicationController {
   @RequestMapping("/")
   public String hello() {
      return "Hello World!";
   }
}