package com.company;

import java.util.ArrayList;


public abstract class Worker implements Comparable<Worker>{
    public static ArrayList <Worker> workers = new ArrayList<>();
    int id;
    String name;
    String position;
    double averageSalary;

    public Worker(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return averageSalary;
    }
    public abstract void setAverageSalary(double salary);

    @Override
    public int compareTo(Worker o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return name + " " + position + " " + this.getClass().toString().substring(1+this.getClass().toString().lastIndexOf('.'))+" средняя зарплата "+ averageSalary+"р";
    }
}
