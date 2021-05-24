package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.HashMap;
import java.util.Map;

public class Wednesday {
    private Map<String, Integer> robotParts = new HashMap<>();
    private Factory factory;
    private int armyCounter;

    public Wednesday(Factory factory) {
        this.factory = factory;
        armyCounter = 0;
        robotParts.put("head", 0);
        robotParts.put("torso", 0);
        robotParts.put("hand", 0);
        robotParts.put("feet", 0);
    }

    public void getParts() {
        String currentPart = factory.getPart();
        if (!currentPart.equals("dust")) {
            robotParts.replace(currentPart, robotParts.get(currentPart) + 1);
        }
        makeRobot();

    }

    public void makeRobot() {
        if(robotParts.get("head") >= 1 && robotParts.get("torso") >= 1 && robotParts.get("hand") >= 1 && robotParts.get("feet") >= 1) {
            armyCounter ++;
            robotParts.replace("head", robotParts.get("head") - 1);
            robotParts.replace("torso", robotParts.get("torso") - 1);
            robotParts.replace("hand", robotParts.get("hand") - 1);
            robotParts.replace("feet", robotParts.get("feet") - 1);
        }
    }

    public int getArmyCounter() {
        return armyCounter;
    }

    public Factory getFactory() {
        return factory;
    }

    public Map<String, Integer> getRobotParts() {
        return robotParts;
    }
}
