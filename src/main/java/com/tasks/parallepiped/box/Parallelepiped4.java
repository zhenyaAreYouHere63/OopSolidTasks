package org.tasks.parallelepiped.boxes;

import org.tasks.parallelepiped.method.Formula;

public class Parallelepiped4 extends Formula {

    @Override
    public double calculateVolume() {
        double area = 24.0;
        double height = 14.0;
        return area * height;
    }
}
