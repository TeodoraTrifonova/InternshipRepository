package com.example.den4springbootapp.domain.services;

import com.example.den4springbootapp.domain.models.Coordinate;
import com.example.den4springbootapp.domain.services.interfaces.LocationInterface;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LocationServiceImpl implements LocationInterface {

    private Map<String, Coordinate> location = new HashMap<>();

    public LocationServiceImpl() {
        this.location = new HashMap<>();
        location.put("Varna", new Coordinate(43, 27));
    }

    @Override
    public void addLocation(String label, Coordinate coordinate) {
        if(!location.containsKey(label))
        {
            location.put(label, coordinate);
        }
    }

    @Override
    public Coordinate fingCoordinate(String label) {
        if(!location.containsKey(label))
        {
           return location.get(label);
        }
        return null;
    }
}
