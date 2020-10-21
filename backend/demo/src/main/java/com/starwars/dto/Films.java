
package com.starwars.dto;

public class Films
{
    private String title;
    private String director;
    private String producer;
    private String release_date;
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(final String title) {
        this.title = title;
    }
    
    public String getDirector() {
        return this.director;
    }
    
    public void setDirector(final String director) {
        this.director = director;
    }
    
    public String getProducers() {
        return this.producer;
    }
    
    public void setProducers(final String producers) {
        this.producer = producers;
    }
    
    public String getRelease_date() {
        return this.release_date;
    }
    
    public void setRelease_date(final String release_date) {
        this.release_date = release_date;
    }
}