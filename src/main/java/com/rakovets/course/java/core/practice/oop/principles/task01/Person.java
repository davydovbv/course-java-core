package com.rakovets.course.java.core.practice.oop.principles.task01;

public class Person {
    private double happiness;

    public Person (double happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness (double percentHappiness) {
        this.happiness += percentHappiness;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
