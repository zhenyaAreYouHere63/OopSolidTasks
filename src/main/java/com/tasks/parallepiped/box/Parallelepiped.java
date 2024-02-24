package com.tasks.parallepiped.box;

import com.tasks.parallepiped.method.ColoredShape;

public class Parallelepiped extends ColoredShape {

    @Override
    public void calculateVolume(double a, double b) {
        double volume = a * b;
        System.out.println(volume);
    }
}
