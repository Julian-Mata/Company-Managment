package com.example.companymanagment.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "technicianid")
public class Technician extends Employee{

//    public Technician(String name, String surname, String email, String birthday, double salary, double percentage, char type) {
//        super(name, surname, email, birthday, salary, percentage, type);
//    }

    public Technician() {

    }

//    @Override
//    public double getTotalAmount(Manager manager) {
//        return 0;
//    }

//    @Override
//    public double getTotalAmount() {
//        return 0;
//    }

    @Override
    public void calcSalary() {
        this.setCalculated(true);
    }
}
