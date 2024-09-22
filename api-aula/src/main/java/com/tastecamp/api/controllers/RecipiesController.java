package com.tastecamp.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.RecipieDTO;
import com.tastecamp.api.models.Recipie;
import com.tastecamp.api.repository.RecipieRepositoty;

@RestController
@RequestMapping("/api/recipies")
public class RecipiesController {

	@Autowired
	private RecipieRepositoty repository;

	@GetMapping
	public String getAll() {
		return "retornou todas as receitas!";
	}

	@PostMapping
	public void create(@RequestBody RecipieDTO req) {
		repository.save(new Recipie(req));
	}
}
