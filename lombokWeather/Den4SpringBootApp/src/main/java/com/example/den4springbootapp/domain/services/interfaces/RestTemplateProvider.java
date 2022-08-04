package com.example.den4springbootapp.domain.services.interfaces;

import org.springframework.web.client.RestTemplate;

public interface RestTemplateProvider {
    RestTemplate getTemplate();
}
