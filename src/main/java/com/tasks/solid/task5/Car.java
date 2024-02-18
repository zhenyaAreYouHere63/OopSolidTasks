package org.tasks.solid.task5;

import lombok.Data;

/**
 * How can you comment this piece of code? Can we make any improvements here?
 *
 * @author p.serhiienko
 */
@Data
public class Car {

    //    private String make;
//    private String model;
    private int year;
    private double price;

    public double calculateSalePrice() {
        if (year < 2010) {
            return price * 0.5;
        } else if (year < 2015) {
            return price * 0.75;
        } else {
            return price;
        }
    }
}

/*               Violations
 * Redundant fields (make and model)
 * Single responsibility principle
 *           Are Possible improvements
 * Move the method to a separate class
 * Delete redundant fields
 */
