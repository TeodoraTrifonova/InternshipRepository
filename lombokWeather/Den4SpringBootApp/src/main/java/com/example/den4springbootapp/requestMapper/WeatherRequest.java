package com.example.den4springbootapp.requestMapper;

public class WeatherRequest {
    private String x;
    private String y;

    public WeatherRequest(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
