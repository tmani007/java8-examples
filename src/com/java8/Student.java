package com.java8;

public class Student {
    private long id;
    private String name;
    private int fees;
    private double percentage;

    public Student() {}

    public Student(long id, String name, int fees, double percentage) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.percentage = percentage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                ", percentage=" + percentage +
                '}';
    }
}
