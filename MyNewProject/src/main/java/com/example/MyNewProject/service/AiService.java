package com.example.MyNewProject.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AiService {

    @Value("${gemini.api.key}")
    private String apiKey;
    @Value("${gemini.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();
    public String generateSummary(String prompt) throws Exception {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String body = """
    {
      "contents": [
        {
          "parts": [
            { "text": "%s" }
          ]
        }
      ]
    }
    """.formatted(prompt);

        HttpEntity<String> entity = new HttpEntity<>(body, headers);

        String finalUrl = apiUrl + "?key=" + apiKey;

        ResponseEntity<String> response =
                restTemplate.postForEntity(finalUrl, entity, String.class);

        String responseBody = response.getBody();
        System.out.println(responseBody);

        //  Parse JSON
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> json = mapper.readValue(responseBody, Map.class);

        List<Map<String, Object>> candidates =
                (List<Map<String, Object>>) json.get("candidates");

        Map<String, Object> firstCandidate = candidates.get(0);

        Map<String, Object> content =
                (Map<String, Object>) firstCandidate.get("content");

        List<Map<String, Object>> parts =
                (List<Map<String, Object>>) content.get("parts");

        Map<String, Object> firstPart = parts.get(0);

        return firstPart.get("text").toString();
    }


}
