package com.tasks.parallepiped.extend;

import com.tasks.parallepiped.method.ColoredShape;
import lombok.Getter;

@Getter
public class Parallelepiped extends ColoredShape {

    private final double height;

    private final String color;


    public Parallelepiped(double height, String color) {
        this.height = height;
        this.color = color;
    }

    @Override
    public void calculateVolume(double a, double b) {
        double volume = a * b * height;
        System.out.println(volume);
    }
}
