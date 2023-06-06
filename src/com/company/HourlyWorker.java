package com.company;

public class HourlyWorker extends Worker{
    public HourlyWorker(int id, String name, String position) {
        super(id, name, position);
    }
    public void setHourlySalary(double salary){
        setAverageSalary(salary);
    }

    public void setAverageSalary(double hourlySalary) {
        averageSalary=hourlySalary*20.8*8;
    }
}
