package org.tasks.parallelepiped.extend;

import org.tasks.parallelepiped.method.Formula;

public class Cube extends Formula {

    private final String color = "pink";
    @Override
    public double calculateVolume() {
        double sideOfSquare = 21.0;
        return Math.pow(sideOfSquare, 3);
    }

    public String getColor() {
        return color;
    }
}
