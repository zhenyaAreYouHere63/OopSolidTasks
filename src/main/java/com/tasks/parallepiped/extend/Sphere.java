package com.tasks.parallepiped.extend;

import com.tasks.parallepiped.common.Color;
import com.tasks.parallepiped.common.Shape;
import lombok.Getter;

@Getter
public class Sphere extends Shape {

    private static final float PI = 3.14f;

    private final double radius;

    private final Color color;

    public Sphere(Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double calculateVolume() {
        return ((double) 4 / 3) * PI * Math.pow(radius, 3);
    }
}
