package com.tasks.parallepiped;

import com.tasks.parallepiped.box.BoxParallelepiped;
import com.tasks.parallepiped.extend.Parallelepiped;
import com.tasks.parallepiped.common.Color;
import com.tasks.parallepiped.common.Shape;
import com.tasks.parallepiped.extend.Cube;
import com.tasks.parallepiped.extend.Pyramid;
import com.tasks.parallepiped.extend.Sphere;

public class Main {

    public static void main(String[] args) {
        Shape coloredShape = new BoxParallelepiped(10.0, 15.0, 18.0);
        System.out.println(coloredShape.calculateVolume());

        Shape cube = new Cube(Color.BLACK, 15.0);
        System.out.println(cube.calculateVolume());

        Shape parallelepiped = new Parallelepiped(9.0, 4.0, 3.0, Color.BROWN);
        System.out.println(parallelepiped.calculateVolume());

        Shape pyramid = new Pyramid(18.0, 15.0, 14.0, Color.BLACK);
        System.out.println(pyramid.calculateVolume());

        Shape sphere = new Sphere(Color.BLUE, 34.0);
        System.out.printf("%.1f",sphere.calculateVolume());
    }
}
