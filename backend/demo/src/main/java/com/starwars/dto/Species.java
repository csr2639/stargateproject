package com.starwars.dto;

public class Species
{
    private String name;
    private String average_lifespan;
    private String classification;
    private String language;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getAverage_lifespan() {
        return this.average_lifespan;
    }
    
    public void setAverage_lifespan(final String average_lifespan) {
        this.average_lifespan = average_lifespan;
    }
    
    public String getClassification() {
        return this.classification;
    }
    
    public void setClassification(final String classification) {
        this.classification = classification;
    }
    
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(final String language) {
        this.language = language;
    }
}