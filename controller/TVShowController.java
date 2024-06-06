package com.olabi.olabiflix.controller;

import com.olabi.olabiflix.model.entity.TVShow;
import com.olabi.olabiflix.repository.TVShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/shows")
public class TVShowController {

    @Autowired
    private TVShowRepository tvShowRepository;

    @GetMapping("/{id}")
    public ResponseEntity<TVShow> getTVShowById(@PathVariable Long id) {
        Optional<TVShow> tvShow = tvShowRepository.findById(id);
        return tvShow.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<TVShow> createTVShow(@RequestBody TVShow tvShow) {
        TVShow savedTVShow = tvShowRepository.save(tvShow);
        return new ResponseEntity<>(savedTVShow, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TVShow> updateTVShow(@PathVariable Long id, @RequestBody TVShow tvShow) {
        Optional<TVShow> existingTVShow = tvShowRepository.findById(id);
        if (existingTVShow.isPresent()) {
            TVShow updatedTVShow = existingTVShow.get();
            updatedTVShow.setTitle(tvShow.getTitle());
            updatedTVShow.setDescription(tvShow.getDescription());
            updatedTVShow.setCreator(tvShow.getCreator());
            updatedTVShow.setTitle(tvShow.getStart());
            updatedTVShow.setGenre(tvShow.getEndYear());

            // Aqui você pode adicionar a lógica para atualizar os campos 'rantig' e
            // 'likesAtuais'

            TVShow savedTVShow = tvShowRepository.save(updatedTVShow);
            return new ResponseEntity<>(savedTVShow, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTVShow(@PathVariable Long id) {
        Optional<TVShow> tvShow = tvShowRepository.findById(id);
        if (tvShow.isPresent()) {
            tvShowRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}