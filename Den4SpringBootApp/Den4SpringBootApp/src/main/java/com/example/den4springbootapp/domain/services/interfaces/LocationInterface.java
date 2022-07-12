package com.example.den4springbootapp.domain.services.interfaces;

import com.example.den4springbootapp.domain.models.Coordinate;

public interface LocationInterface {
    void addLocation(String lavel, Coordinate coordinate);
   Coordinate fingCoordinate(String label);
}
