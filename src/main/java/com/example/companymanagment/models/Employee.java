package com.example.companymanagment.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
    @Id
    private Long id;
    private String name;



    private String surname;
    //private String email;
    private String birthday;
    private double salary;
    private char type;
    private double percentage;
    private boolean calculated = false;

//    public Employee(String name, String surname, String email, String birthday, double salary, double percentage, char type) {
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//        this.birthday = birthday;
//        this.salary = salary;
//        this.type = type;
//        this.percentage = percentage;
//    }

    public Employee() {

    }

    public  double getTotalAmount(Manager manager){ return 0;};
    public  double getTotalAmount(){return 0;};
    public  void calcSalary(){};
    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //public String getEmail() {
     //   return email;
    //}

    //public void setEmail(String email) {
    //    this.email = email;
    //}

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public boolean isCalculated() {
        return calculated;
    }

    public void setCalculated(boolean calculated) {
        this.calculated = calculated;
    }
}
