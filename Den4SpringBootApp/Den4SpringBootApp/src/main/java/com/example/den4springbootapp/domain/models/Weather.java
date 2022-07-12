package com.example.den4springbootapp.domain.models;

import com.example.den4springbootapp.domain.models.weatherapi.Condition;
import com.example.den4springbootapp.domain.models.weatherapi.Current;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
public class Weather {
    private String regiont;
    private String temp;
    private String condition;
/*
    private Coordinate coordinates;
    private Condition condition;
    private Current current;
*/


    public Weather(String regiont, String temp, String condition) {
        this.regiont = regiont;
        this.temp = temp;
        this.condition = condition;
    }

    public String getRegiont() {
        return regiont;
    }

    public void setRegiont(String regiont) {
        this.regiont = regiont;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }


    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Objects.equals(regiont, weather.regiont) && Objects.equals(temp, weather.temp) && Objects.equals(condition, weather.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regiont, temp, condition);
    }
}
