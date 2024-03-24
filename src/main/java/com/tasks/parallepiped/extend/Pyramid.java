package com.tasks.parallepiped.extend;

import com.tasks.parallepiped.common.Color;
import com.tasks.parallepiped.common.Shape;
import lombok.Getter;

@Getter
public class Pyramid extends Shape {

    private final double height;

    private final double sideA;

    private final double sideB;

    private final Color color;
    public Pyramid(double height, double sideA, double sideB, Color color) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double calculateVolume() {
        return  ((double) 1 / 3) * 0.5 * sideA * sideB * height;
    }
}
