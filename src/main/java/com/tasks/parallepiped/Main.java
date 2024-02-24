package com.tasks.parallepiped;

import com.tasks.parallepiped.box.Parallelepiped;
import com.tasks.parallepiped.method.ColoredShape;

public class Main {

    public static void main(String[] args) {
        ColoredShape coloredShape = new Parallelepiped();
        coloredShape.calculateVolume(15.0, 25.0);
        coloredShape.calculateVolume(10.0, 11.0);
        coloredShape.calculateVolume(13.0, 13.0);
        coloredShape.calculateVolume(15.0, 15.0);


    }
}
