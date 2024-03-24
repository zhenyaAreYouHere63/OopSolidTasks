package com.tasks.solid.task4;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bird implements Animal {

    @Override
    public void eat() {
        log.info("Bird is eating worms");
    }

    @Override
    public void sleep() {
        log.info("Bird is sleeping");
    }

    @Override
    public void fly() {
        log.info("Bird is flying");

    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Birds cannot swim");
    }
}
