package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        FixedPaidWorker ivan = new FixedPaidWorker(1, "Ivan", "director");
        ivan.setFixedSalary(200000);

        FixedPaidWorker fedor = new FixedPaidWorker(2, "Fedor", "driver");
        fedor.setFixedSalary(100000);

        HourlyWorker stepan = new HourlyWorker(3, "Stepan", "sales manager");
        stepan.setHourlySalary(500);

        HourlyWorker evgen = new HourlyWorker(4, "Evgeniy", "sales person");
        evgen.setHourlySalary(400);

        FixedPaidWorker marina = new FixedPaidWorker(5, "Marina", "stock manager");
        marina.setFixedSalary(100000);

        Worker.workers.add(ivan);
        Worker.workers.add(fedor);
        Worker.workers.add(stepan);
        Worker.workers.add(evgen);
        Worker.workers.add(marina);

        Collections.sort(Worker.workers);
        printWorkers("Сортировка по имени");
        Collections.sort(Worker.workers, new PositionComparator());
        printWorkers("Сортировка по должности");
        Collections.sort(Worker.workers, new SalaryComparator());
        printWorkers("Сортировка по зарплате");

    }
        static public void printWorkers(String s){
            System.out.println(s);
        for (Worker worker:Worker.workers){
            System.out.println(worker);
        }
            System.out.println();
    }
}
