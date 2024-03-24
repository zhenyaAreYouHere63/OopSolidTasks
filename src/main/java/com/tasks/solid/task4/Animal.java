package com.tasks.solid.task4;

/**
 * Look through interface implementations. Can we consider such solution a best practice?
 * If you have some improvements, pls share your thoughts.
 *
 * @author p.serhiienko
 */
public interface Animal {

    void eat();

    void sleep();

    void fly();

    void swim();
}
/*                   Violations
 * Interface segregation principle
 *               Are Possible improvements
 * Splitting this interface into two interfaces
 */