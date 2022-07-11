package com.example.den4springbootapp.domain.models;

import com.example.den4springbootapp.domain.models.weatherapi.Condition;
import com.example.den4springbootapp.domain.models.weatherapi.Current;

import java.util.Objects;

public class Weather {
    private String forecast;
    private Coordinate coordinates;
    private Condition condition;
    private Current current;

    public Weather(Coordinate coordinates, Condition condition, Current current) {
        this.coordinates = coordinates;
        this.condition = condition;
        this.current = current;
    }

    public Weather(Coordinate coordinates) {
        this.coordinates = coordinates;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather that = (Weather) o;
        return Objects.equals(forecast, that.forecast) && Objects.equals(coordinates, that.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forecast, coordinates);
    }
}
