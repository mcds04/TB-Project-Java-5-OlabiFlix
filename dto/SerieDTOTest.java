package com.olabi.olabiflix.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SerieDTOTest {

    @Test
    public void testGettersAndSetters() {
        TVShowDTO TVShow = new TVShowDTO();
        TVShow.setId(1L);
        TVShow.setTitle("Breaking Bad");
        TVShow.setTotalSeasons(5);
        TVShow.setGenre("Drama");
        TVShow.setWriters("Vince Gilligan");
        TVShow.setPoster("poster_url");
        TVShow.setActors("Bryan Cranston");

        assertEquals(1L, TVShow.getId());
        assertEquals("Breaking Bad", TVShow.getTitle());
        assertEquals(5, TVShow.getTotalSeasons());
        assertEquals("Drama", TVShow.getGenre());
        assertEquals("Vince Gilligan", TVShow.getWriters());
        assertEquals("poster_url", TVShow.getPoster());
        assertEquals("Bryan Cranston", TVShow.getActors());
    }
}