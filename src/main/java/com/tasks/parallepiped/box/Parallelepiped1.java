package org.tasks.parallelepiped.boxes;

import org.tasks.parallelepiped.method.Formula;

public class Parallelepiped1 extends Formula {

    @Override
    public double calculateVolume() {
        double area = 21.0;
        double height = 11.0;
        return area * height;
    }
}
