package com.cars.api_web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api_web.dto.CarDTO;

@RestController
@RequestMapping("/api/car")
public class CarController {

  @PostMapping
  public void create(@RequestBody CarDTO req) {
    System.out.println(req.modelo());
    System.out.println(req.valor());
  }

}
