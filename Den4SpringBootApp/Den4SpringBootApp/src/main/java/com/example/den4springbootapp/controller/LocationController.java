package com.example.den4springbootapp.controller;

import com.example.den4springbootapp.domain.models.Coordinate;
import com.example.den4springbootapp.domain.services.interfaces.LocationInterface;
import com.example.den4springbootapp.requestMapper.LocationRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    private final LocationInterface locationInterface;

    public LocationController(LocationInterface locationInterface) {
        this.locationInterface = locationInterface;
    }

    @PostMapping("/location")
    public void addLocation(@RequestBody LocationRequest locationRequest)
    { Coordinate coordinate = new Coordinate(Double.parseDouble(locationRequest.getLon()),Double.parseDouble(locationRequest.getLat()));
        locationInterface.addLocation(locationRequest.getLabel(),coordinate);
    }
}
