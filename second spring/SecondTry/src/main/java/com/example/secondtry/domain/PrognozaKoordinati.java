package com.example.secondtry.domain;

import java.util.Random;

public class PrognozaKoordinati {
    private double x;
    private double y;

    public PrognozaKoordinati() {
        Random random = new Random();
        this.x = random.nextDouble();
        this.y =  random.nextDouble();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
