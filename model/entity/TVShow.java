package com.olabi.olabiflix.model.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class TVShow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String title;

    @ElementCollection
    private List<String> genre;

    @ElementCollection
    private List<String> actors;

    private List<String> endYear;

    public TVShow() {
    }

    public TVShow(List<String> actors, List<String> endYear) {
        this.actors = actors;
        this.endYear = endYear;
    }

    // getters e setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    private String description;
    private List<String> creator;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getCreator() {
        return this.creator;
    }

    public void setCreator(List<String> creator) {
        this.creator = creator;
    }

    public String getStart() {
        return null;
    }

    public List<String> getEndYear() {
        return this.endYear;
    }

}


