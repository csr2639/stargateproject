package com.starwars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.starwars.dto.Person;
import com.starwars.service.StarWarService;


@CrossOrigin
@RestController
public class StarWarsController {
	  	@Autowired
	    StarWarService service;
	    
	    @GetMapping({ "/getDetails" })
	    public Person getDetails(@RequestParam("id") final String id) {
	        return this.service.getHeroDetails(id);
	    }
	}