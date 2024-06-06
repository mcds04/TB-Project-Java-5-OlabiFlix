package com.olabi.olabiflix.repository;

import com.olabi.olabiflix.model.entity.TVShow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TVShowRepository extends JpaRepository<TVShow, UUID> {
    Optional<TVShow> findById(Long id);

    void deleteById(Long id);
}
