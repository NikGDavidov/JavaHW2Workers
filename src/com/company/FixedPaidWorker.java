package com.company;

public class FixedPaidWorker extends Worker{
    public FixedPaidWorker(int id, String name, String position) {
        super(id, name, position);
    }
    public void setFixedSalary(double salary){
        setAverageSalary(salary);
    }

    @Override
    public void setAverageSalary(double salary) {
        averageSalary=salary;
    }
}
