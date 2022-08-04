package com.example.den4springbootapp.domain.services;

import com.example.den4springbootapp.domain.services.interfaces.RestTemplateProvider;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class RestTemplateProviderImpl implements RestTemplateProvider {
    public RestTemplateProviderImpl() {
        System.out.println("RestTemplateProviderImpl initialized");
    }

    @Override
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
