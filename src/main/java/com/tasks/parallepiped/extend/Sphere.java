package org.tasks.parallelepiped.extend;

import org.tasks.parallelepiped.method.Formula;

public class Sphere extends Formula {

    private final String color = "yellow";

    @Override
    public double calculateVolume() {
        double pi = 3.14;
        double radius = 11.0;
        return pi * Math.pow(radius, 3) * (4/3);
    }

    public String getColor() {
        return color;
    }
}
