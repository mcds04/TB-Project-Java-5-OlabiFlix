package com.olabi.olabiflix.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class TVShowDTO {
    private Long id;

    @NotBlank
    private String title;

    @NotNull
    private Integer totalSeasons;

    private String genre;
    private String writers;
    private String poster;
    private String actors;
    private List<RatingDTO> ratings;

    public TVShowDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTotalSeasons() {
        return totalSeasons;
    }

    public void setTotalSeasons(Integer totalSeasons) {
        this.totalSeasons = totalSeasons;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public List<RatingDTO> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingDTO> ratings) {
        this.ratings = ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TVShowDTO)) return false;
        TVShowDTO that = (TVShowDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TVShowDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", totalSeasons=" + totalSeasons +
                ", genre='" + genre + '\'' +
                ", writers='" + writers + '\'' +
                ", poster='" + poster + '\'' +
                ", actors='" + actors + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
