package com.rakovets.course.java.core.practice.jcf_set.operations;

import com.rakovets.course.java.core.practice.jcf_set.UsersDataBase;

import java.util.Random;

public abstract class Operation {
    private int priority;

    public Operation(){
        Random rnd = new Random();
        priority = rnd.nextInt(100) + 1;
    }

    public abstract void execute(UsersDataBase dataBase);

    public Integer getPriority() {
        return priority;
    }
}
