package org.tasks.parallelepiped.boxes;

import org.tasks.parallelepiped.method.Formula;

public class Parallelepiped3 extends Formula {

    @Override
    public double calculateVolume() {
        double area = 23.0;
        double height = 13.0;
        return area * height;
    }
}
