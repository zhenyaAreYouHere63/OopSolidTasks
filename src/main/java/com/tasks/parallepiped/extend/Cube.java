package com.tasks.parallepiped.extend;

import com.tasks.parallepiped.method.ColoredShape;
import lombok.Getter;

@Getter
public class Cube extends ColoredShape {

    private final String color;

    public Cube(String color) {
        this.color = color;
    }

    public void calculateVolume(double a) {
        double volume = Math.pow(a, 3);
        System.out.println(volume);
    }
}
