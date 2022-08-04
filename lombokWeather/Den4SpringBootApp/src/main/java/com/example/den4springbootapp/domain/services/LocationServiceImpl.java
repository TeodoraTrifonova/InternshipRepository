package com.example.den4springbootapp.domain.services;

import com.example.den4springbootapp.domain.models.Coordinate;
import com.example.den4springbootapp.domain.models.weatherapi.Location;
import com.example.den4springbootapp.domain.services.interfaces.LocationService;
import com.example.den4springbootapp.requestMapper.LocationRequest;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Primary
public class LocationServiceImpl implements LocationService {
    private final HashMap<String,Coordinate> locations;

    public LocationServiceImpl() {
        this.locations=new HashMap<>();
        locations.put("Varna",new Coordinate(43,27));
    }

    @Override
    public void addLocation(String label, Coordinate coordinates) {
        if(!locations.containsKey(label)){
            locations.put(label,coordinates);
        }
    }

    @Override
    public Coordinate findCoordinates(String label) {
        return locations.get(label);
    }

    @Override
    public List<LocationRequest> getAllLocations() {
        List<LocationRequest> result=new ArrayList<>();
        for(String s:locations.keySet()){
            LocationRequest temp=LocationRequest.builder()
                    .label(s)
                    .lon(locations.get(s).getLon())
                    .lat(locations.get(s).getLat())
                    .build();
            result.add(temp);
        }
        return result;
    }
}
