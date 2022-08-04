package com.example.den4springbootapp.controller;

import com.example.den4springbootapp.domain.models.Coordinate;
import com.example.den4springbootapp.domain.services.interfaces.LocationService;
import com.example.den4springbootapp.requestMapper.LocationRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping("/location")
    public void addLocation(@RequestBody LocationRequest locationRequest){
        locationService.addLocation(locationRequest.getLabel(),Coordinate.builder()
                        .lat(locationRequest.getLat())
                        .lon(locationRequest.getLon())
                .build());
    }
    @GetMapping("/getAllLocations")
    public List<LocationRequest> getLocations(){
        return locationService.getAllLocations();
    }
}
