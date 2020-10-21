package com.starwars.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starwars.dao.StarWarsDAO;
import com.starwars.dto.Films;
import com.starwars.dto.HomePlanet;
import com.starwars.dto.Person;
import com.starwars.dto.Species;


@Service
public class StarWarService
{
    @Autowired
    StarWarsDAO starwarsDao;
    
    public Person getHeroDetails(final String id) {
        final Person person = this.starwarsDao.getHeroDetails(id).block();
        final List<Films> filmsData = new ArrayList<Films>();
        final List<Species> speciesData = new ArrayList<Species>();
       
        person.getFilms().forEach(film -> {
        	 Films filmDetails = new Films();
            filmDetails = this.starwarsDao.getFilmDetails(film).block();
            filmsData.add(filmDetails);
            return;
        });
        person.getSpecies().forEach(sp -> {
        	Species species = new Species();
        	species=	this.starwarsDao.getSpeciesDetails(sp).block();
            speciesData.add(species);
            return;
        });
        final HomePlanet homeData = this.starwarsDao.getHomePlanet(person.getHomeworld()).block();
        person.setFilmsData(filmsData);
        person.setSpeciesData(speciesData);
        person.setHomePlanet(homeData);
        return person;
    }
}