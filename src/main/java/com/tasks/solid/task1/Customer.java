package org.tasks.solid.task1;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Are there any violations in this code?
 * If yes - describe what is it that worth changing and which improvements are possible?
 *
 * @author p.serhiienko
 */
@Data
@Slf4j
public class Customer {

    private String name;
    private String address;
    private double balance;

    public void increaseBalance(double value) {
        balance += value;
    }

    public void decreaseBalance(double value) {
        balance -= value;
    }

    public void processPayment(double sumForPayment) {
        if (isPriceResonable(sumForPayment)) {
            decreaseBalance(sumForPayment);
            log.info("Payment processed successfully");
        } else {
            throw new IllegalArgumentException("Payment cannot be processed. Check your balance");
        }
    }

    private boolean isPriceResonable(double sumForPayment) {
        return sumForPayment <= balance;
    }

}

/*                    Violations
 * Single Responsibility Principle
 * Open/Closed Principle
 *               Are Possible improvements
 *  Separation of fields and methods (so that the class performs purely its role)
 *  Add interfaces that will contain our methods
 */
