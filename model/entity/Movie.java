package com.olabi.olabiflix.model.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id; // Identificador único do filme.

    private String released; // Data de lançamento do filme.
    private String runtime; // Duração do filme.
    private String director; // Diretor do filme.
    private String writer; // Escritor(es) do filme.
    private String language; // Idioma(s) do filme.
    private String title;

    public Movie() {
    }

    // getters e setters para todos os novos campos

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setTitulo() {
        // Avatar.
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return this.title;
    }

    public Object getDescription() {
        return this.director;
    }

    public void setDescription(Object ignoredDescription) {

    }

    public String getRelease() {
        return "";
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
