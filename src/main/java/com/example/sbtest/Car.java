package com.example.sbtest;

import java.util.StringJoiner;

public class Car {
private String model;
private String mark;

    public Car(String mark, String model) {
        this.model = model;
        this.mark = mark;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("model='" + model + "'")
                .add("mark='" + mark + "'")
                .toString();
    }
}
