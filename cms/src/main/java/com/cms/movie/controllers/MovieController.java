package com.cms.movie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cms.movie.beans.GenericResponse;
import com.cms.movie.beans.MovieCreateRequest;
import com.cms.movie.entity.MovieEsEntity;
import com.cms.movie.service.MovieService;


@RestController
public class MovieController {
	@Autowired
	MovieService movieservice;
	@PostMapping("/create")
	public  GenericResponse add(@RequestBody MovieCreateRequest request) {
		GenericResponse response=movieservice.add(request);
		return response;
	}
	
	@GetMapping("/get")
	public  List<MovieEsEntity> get(@RequestParam String title) {
		List<MovieEsEntity> response=movieservice.get(title);
		return response;
	}

	

}
