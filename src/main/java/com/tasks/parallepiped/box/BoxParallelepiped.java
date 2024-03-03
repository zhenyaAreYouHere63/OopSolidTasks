package com.tasks.parallepiped.box;

import com.tasks.parallepiped.common.Shape;

public class BoxParallelepiped extends Shape {

    private final double height;
    private final double sideA;
    private final double sideB;

    public BoxParallelepiped(double height, double sideA, double sideB) {
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateVolume() {
        return sideA * sideB * height;
    }
}
