package org.tasks.parallelepiped.extend;
import org.tasks.parallelepiped.method.Formula;

public class Parallelepiped extends Formula {
    private final String color = "red";
    @Override
    public double calculateVolume() {
        double area = 21.0;
        double height = 11.0;
        return area * height;
    }

    public String getColor() {
        return color;
    }
}
