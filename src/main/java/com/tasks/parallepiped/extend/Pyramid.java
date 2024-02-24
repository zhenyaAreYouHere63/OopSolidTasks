package com.tasks.parallepiped.extend;

import com.tasks.parallepiped.method.ColoredShape;
import lombok.Getter;

@Getter
public class Pyramid extends ColoredShape {

    private final double height;

    private final String color;
    public Pyramid(String color, double height) {
        this.color = color;
        this.height = height;
    }

    @Override
    public void calculateVolume(double a, double b) {
        double volume = ((double) 1 / 3) * a * b * height;
        System.out.println(volume);
    }
}
