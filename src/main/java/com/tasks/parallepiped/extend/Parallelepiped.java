package com.tasks.parallepiped.extend;

import com.tasks.parallepiped.common.Color;
import com.tasks.parallepiped.common.Shape;
import lombok.Getter;

@Getter
public class Parallelepiped extends Shape {

    private final double height;

    private final double sideA;

    private final double sideB;

    private final Color color;


    public Parallelepiped(double height, double sideA, double sideB, Color color) {
        this.height = height;
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateVolume() {
        return sideA * sideB * height;
    }
}
