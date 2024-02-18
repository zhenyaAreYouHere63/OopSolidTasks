package org.tasks.solid.task4;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fish implements Animal{

    @Override
    public void eat() {
        log.info("Fish is eating seeweed");
    }

    @Override
    public void sleep() {
        log.info("Fish is sleeping");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Fish cannot fly");
    }

    @Override
    public void swim() {
        log.info("Fish is swimming in the river");
    }
}
