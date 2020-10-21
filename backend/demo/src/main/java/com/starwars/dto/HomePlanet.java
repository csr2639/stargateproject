package com.starwars.dto;

public class HomePlanet
{
    private String name;
    private String terrain;
    private String population;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getTerrain() {
        return this.terrain;
    }
    
    public void setTerrain(final String terrain) {
        this.terrain = terrain;
    }
    
    public String getPopulation() {
        return this.population;
    }
    
    public void setPopulation(final String population) {
        this.population = population;
    }
}