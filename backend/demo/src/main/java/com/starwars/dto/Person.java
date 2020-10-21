package com.starwars.dto;

import java.util.List;

public class Person
{
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String gender;
    private String birth_year;
    private List<String> films;
    private List<String> species;
    private List<Films> filmsData;
    private List<Species> speciesData;
    private String homeworld;
    private HomePlanet homePlanet;
    private String name;
    
    public String getHomeworld() {
        return this.homeworld;
    }
    
    public void setHomeworld(final String homeworld) {
        this.homeworld = homeworld;
    }
    
    public List<Films> getFilmsData() {
        return this.filmsData;
    }
    
    public void setFilmsData(final List<Films> filmsData) {
        this.filmsData = filmsData;
    }
    
    public List<Species> getSpeciesData() {
        return this.speciesData;
    }
    
    public void setSpeciesData(final List<Species> speciesData) {
        this.speciesData = speciesData;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getHeight() {
        return this.height;
    }
    
    public void setHeight(final String height) {
        this.height = height;
    }
    
    public String getMass() {
        return this.mass;
    }
    
    public void setMass(final String mass) {
        this.mass = mass;
    }
    
    public String getHair_color() {
        return this.hair_color;
    }
    
    public void setHair_color(final String hair_color) {
        this.hair_color = hair_color;
    }
    
    public String getSkin_color() {
        return this.skin_color;
    }
    
    public void setSkin_color(final String skin_color) {
        this.skin_color = skin_color;
    }
    
    public String getEye_color() {
        return this.eye_color;
    }
    
    public void setEye_color(final String eye_color) {
        this.eye_color = eye_color;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(final String gender) {
        this.gender = gender;
    }
    
    public String getBirth_year() {
        return this.birth_year;
    }
    
    public void setBirth_year(final String birth_year) {
        this.birth_year = birth_year;
    }
    
    public List<String> getFilms() {
        return this.films;
    }
    
    public void setFilms(final List<String> films) {
        this.films = films;
    }
    
    public List<String> getSpecies() {
        return this.species;
    }
    
    public void setSpecies(final List<String> species) {
        this.species = species;
    }
    
    public HomePlanet getHomePlanet() {
        return this.homePlanet;
    }
    
    public void setHomePlanet(final HomePlanet homePlanet) {
        this.homePlanet = homePlanet;
    }
}