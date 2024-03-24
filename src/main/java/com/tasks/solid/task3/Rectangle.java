package com.tasks.solid.task3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle {
    protected double width;
    protected double height;

    public double getArea() {
        return width * height;
    }
}

