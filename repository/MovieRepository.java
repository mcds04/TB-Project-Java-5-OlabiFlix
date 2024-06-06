package com.olabi.olabiflix.repository;

import com.olabi.olabiflix.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    // Buscar filmes pelo título
    List<Movie> findByTitulo(String titulo);

    // Buscar filmes pelo gênero
    List<Movie> findByGenero(String genero);

    // Buscar filmes pelo ano de lançamento
    List<Movie> findByAnoLancamento(int anoLancamento);
}
