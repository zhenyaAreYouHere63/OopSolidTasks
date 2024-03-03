package com.tasks.parallepiped.extend;

import com.tasks.parallepiped.common.Color;
import com.tasks.parallepiped.common.Shape;
import lombok.Getter;

@Getter
public class Cube extends Shape {

    private double sideA;

    private final Color color;

    public Cube(Color color, double sideA) {
        this.color = color;
        this.sideA = sideA;
    }

    public double calculateVolume() {
        return Math.pow(sideA, 3);
    }
}
