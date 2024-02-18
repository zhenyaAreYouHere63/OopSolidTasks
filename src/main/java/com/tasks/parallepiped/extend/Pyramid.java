package org.tasks.parallelepiped.extend;

import org.tasks.parallelepiped.method.Formula;

public class Pyramid extends Formula {

    private final String color = "green";

    @Override
    public double calculateVolume() {
        double height = 8.5;
        double area = 11.0;
        return height * area * ((double) 1 / 3);
    }

    public String getColor() {
        return color;
    }
}
