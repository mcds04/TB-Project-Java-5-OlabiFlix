package com.olabi.olabiflix.service;

import com.olabi.olabiflix.model.entity.TVShow;
import com.olabi.olabiflix.repository.TVShowRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TVShowService {

    private final TVShowRepository TVShowRepository;

    public TVShowService(com.olabi.olabiflix.repository.TVShowRepository tvShowRepository) {
        TVShowRepository = tvShowRepository;
    }

    public List<TVShow> getAllSeries() {
        return TVShowRepository.findAll();
    }

    public TVShow getSeriesById(UUID id) {
        return TVShowRepository.findById(id).orElse(null);
    }

    public TVShow saveSeries(TVShow TVShow) {
        return TVShowRepository.save(TVShow);
    }

    public void deleteSeries(UUID id) {
        TVShowRepository.deleteById(id);
    }
}
