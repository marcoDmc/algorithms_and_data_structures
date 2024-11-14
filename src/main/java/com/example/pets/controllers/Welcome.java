package com.example.pets.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Welcome {

    @GetMapping("/")
    @SuppressWarnings("CallToPrintStackTrace")
    public String saudation() {
        Map<String, Object> jsonMap = new HashMap<>();

        jsonMap.put("name", "batata");

        ObjectMapper mapperObj = new ObjectMapper();

        String result = null;
        try {
            result = mapperObj.writeValueAsString(jsonMap);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
