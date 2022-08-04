package com.example.den4springbootapp.domain.services.interfaces;

import com.example.den4springbootapp.domain.models.Coordinate;
import com.example.den4springbootapp.domain.models.weatherapi.Location;
import com.example.den4springbootapp.requestMapper.LocationRequest;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface LocationService {
    void addLocation(String label,Coordinate coordinates);
    Coordinate findCoordinates(String label);
    List<LocationRequest> getAllLocations();
}
