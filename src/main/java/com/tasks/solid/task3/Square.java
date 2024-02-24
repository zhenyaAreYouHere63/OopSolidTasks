package com.tasks.solid.task3;


/**
 * Are there any violations in this code (see Rectangle class too)?
 * If yes - describe what is it that worth changing and which improvements are possible?
 * <p>
 * Is such case possible? Do you have any comments for this?
 * <p>
 * public void resize(Rectangle r, int newWidth, int newHeight) {
 * r.setWidth(newWidth);
 * r.setHeight(newHeight);
 * }
 *
 * @author p.serhiienko
 */
public class Square extends Rectangle {

    public Square(int size) {
        super(size, size);
    }
}

/*
 *                     Violations
 * Single responsibility principle
 *               Are Possible improvements
 * In rectangle class separate method getArea();
 *  This method resize may exist in this program but moved to the interface
 */