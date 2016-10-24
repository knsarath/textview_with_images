package com.text.textviewwithimage;

public class Car {
    private String name;
    private String type;
    private String milage;

    public Car(String name, String type, String milage) {
        this.name = name;
        this.type = type;
        this.milage = milage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMilage() {
        return milage;
    }

    public void setMilage(String milage) {
        this.milage = milage;
    }
}
