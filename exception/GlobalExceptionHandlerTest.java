package com.olabi.olabiflix.exception;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(GlobalExceptionHandler.class)
public class GlobalExceptionHandlerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testResourceNotFoundException() throws Exception {
        mockMvc.perform(get("/nonexistent-endpoint"))
                .andExpect(status().isNotFound())
                .andExpect(content().string("Resource not found"));
    }

    @Test
    public void testInvalidInputException() throws Exception {
        mockMvc.perform(get("/invalid-input-endpoint"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Invalid input provided"));
    }

    @Test
    public void testGeneralException() throws Exception {
        mockMvc.perform(get("/general-error-endpoint"))
                .andExpect(status().isInternalServerError())
                .andExpect(content().string("An error occurred"));
    }
}