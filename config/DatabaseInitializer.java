package com.olabi.olabiflix.config;

import com.olabi.olabiflix.repository.MovieRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private TVShowControllerRepository TVShowControllerRepository;

    public DatabaseInitializer(TVShowControllerRepository TVShowControllerRepository) {
        this.TVShowControllerRepository = TVShowControllerRepository;
    }

    @PostConstruct
    public void initDatabase() {
        // Inicializar o banco de dados com os dados fornecidos
        initFilmes();
        initSeries();
    }

    private void initFilmes() {
        // Lógica para inicializar os filmes
    }

    private void initSeries() {
        // Lógica para inicializar as séries
    }
}