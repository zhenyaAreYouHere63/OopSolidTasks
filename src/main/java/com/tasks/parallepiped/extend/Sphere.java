package com.tasks.parallepiped.extend;

import com.tasks.parallepiped.method.ColoredShape;
import lombok.Getter;

@Getter
public class Sphere extends ColoredShape {

    private final double radius;

    private final String color;

    public Sphere(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public void calculateVolume() {
        double volume = ((double) 4 / 3) * PI * Math.pow(radius, 3);
    }
}
