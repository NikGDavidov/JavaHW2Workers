package com.company;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return (int)Math.round(o1.getSalary()-o2.getSalary());
    }
}
