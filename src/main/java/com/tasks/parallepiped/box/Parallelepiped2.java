package org.tasks.parallelepiped.boxes;

import org.tasks.parallelepiped.method.Formula;

public class Parallelepiped2 extends Formula {
    @Override
    public double calculateVolume() {
        double area = 22.0;
        double height = 12.0;
        return area * height;
    }
}
