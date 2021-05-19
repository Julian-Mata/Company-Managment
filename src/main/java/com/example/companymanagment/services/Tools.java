package com.example.companymanagment.services;

import com.example.companymanagment.models.*;

import java.util.List;

public class Tools {
    //calc total salary including sublevels
    public static <T extends Employee>  void  calcSalary(List<T> managed) {
        double amount = 0;
        for(T t : managed){
            if(t.getType()=='M'){
                amount = amount + getTotalAmount((Manager) t, ((Manager) t).managed); // if its manager take salary of all members managed by him
            }
            else if(t.getType()=='S'){
                calcSalarySeller((Seller) t,((Seller)t).sales);
                amount = amount + t.getSalary();// else take the amount from simple workers
            }
            else if(t.getType()=='T'){
                calcSalaryTech((Technician) t);
            }
            t.setSalary(t.getSalary() + ((t.getPercentage()/100)*amount));
            t.setCalculated(true);
        }

    }
    //for technician
    private static void calcSalaryTech(Technician technician) {
        technician.setCalculated(true);
    }

    //for each submanager
    private static <T extends Employee> double getTotalAmount(Manager manager,List<T> l) {
        double total = 0;
        List<T> liste = l;
        if(!manager.isCalculated()) manager.calcSalary();//if this manager have its own managed managers we implicit call calcSalary so for each level to calc properly
        for (Employee t : liste) {
            total = total + t.getSalary();
        }
        total = total + manager.getSalary();//add also the salary of the managed manager
        return total;
    }
    //##########################################################################################################
    // SELLER
    public static void calcSalarySeller(Seller seller,List<Sale> liste) {
        seller.setSalary(seller.getSalary() + ((seller.getPercentage()/100)*getTotalAmount(liste)));
        seller.setCalculated(true);
    }
    public static double getTotalAmount(List<Sale> sales){
        double total = 0;
        for(Sale s : sales){
            total = total + s.getProduktPrice();
        }
        return total;
    }
}
