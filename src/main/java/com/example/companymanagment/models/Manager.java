package com.example.companymanagment.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Manager/*<T extends Employee>*/ extends Employee{


//    public Manager(String name, String surname, String email, String birthday,double salary,double percentage,char type) {
//        super(name, surname, email, birthday,salary,percentage,type);
//    }
    @OneToMany(targetEntity = Manager.class, mappedBy="Manager")
    public List<Employee> managed;
    public Manager() {

    }

//    public void addManaged(Employee e) {
//        managed.add(e);
//    }
//    //calc total salary including sublevels
//    public void calcSalary() {
//        double amount = 0;
//        for(Employee t : managed){
//            if(t instanceof Manager){
//                amount = amount + getTotalAmount((Manager) t); // if its manager take salary of all members managed by him
//            }
//            else {
//                if(!t.isCalculated()) {// check if its calculated
//                    t.calcSalary();
//                }
//                amount = amount + t.getSalary();// else take the amount from simple workers
//            }
//        }
//        this.setSalary(this.getSalary() + ((this.getPercentage()/100)*amount));
//        this.setCalculated(true);
//    }
//
//    //for each submanager
//    public double getTotalAmount(Manager manager) {
//        double total = 0;
//        List<Employee> liste = manager.managed;
//        if(!manager.isCalculated()) manager.calcSalary();//if this manager have its own managed managers we implicit call calcSalary so for each level to calc properly
//        for (Employee t : liste) {
//            total = total + t.getSalary();
//        }
//        total = total + manager.getSalary();//add also the salary of the managed manager
//        return total;
//    }

    @Override
    public double getTotalAmount() {
        return 0;
    }
}
