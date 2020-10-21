package com.starwars.dao;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.starwars.dto.Films;
import com.starwars.dto.HomePlanet;
import com.starwars.dto.Person;
import com.starwars.dto.Species;

import reactor.core.publisher.Mono;

@Service
public class StarWarsDAO
{
    private final WebClient webClient;
    
    public StarWarsDAO(final WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }
    
    public Mono<Person> getHeroDetails(final String id) {
        return this.webClient.get().uri("https://swapi.dev/api/people/" + id + "/").retrieve().bodyToMono(Person.class);
    }
    
    public Mono<Films> getFilmDetails(String url) {
        url = this.convertToHttps(url);
        return this.webClient.get().uri(url).retrieve().bodyToMono(Films.class);
    }
    
    public Mono<Species> getSpeciesDetails(String url) {
        url = this.convertToHttps(url);
        return this.webClient.get().uri(url).retrieve().bodyToMono(Species.class);
    }
    
    public Mono<HomePlanet> getHomePlanet(String url) {
        url = this.convertToHttps(url);
        return this.webClient.get().uri(url).retrieve().bodyToMono(HomePlanet.class);
    }
    
    private String convertToHttps(String str) {
        return String.valueOf(str.substring(0, 4)) + "s" + str.substring(4);
    }
}