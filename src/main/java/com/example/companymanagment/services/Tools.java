package com.example.companymanagment.services;

import com.example.companymanagment.models.Employee;
import com.example.companymanagment.models.Manager;
import com.example.companymanagment.models.Sale;
import com.example.companymanagment.models.Seller;

import java.util.List;

public class Tools {
    //calc total salary including sublevels
    public static  void calcSalary(List<Employee> managed) {
        double amount = 0;
        for(Employee t : managed){
            if(t instanceof Manager){
                amount = amount + getTotalAmount((Manager) t,managed); // if its manager take salary of all members managed by him
            }
            else {
                if(!t.isCalculated()) {// check if its calculated
                    t.calcSalary();
                }
                amount = amount + t.getSalary();// else take the amount from simple workers
            }
            t.setSalary(t.getSalary() + ((t.getPercentage()/100)*amount));
            t.setCalculated(true);
        }

    }

    //for each submanager
    private static double getTotalAmount(Manager manager,List<Employee> l) {
        double total = 0;
        List<Employee> liste = l;
        if(!manager.isCalculated()) manager.calcSalary();//if this manager have its own managed managers we implicit call calcSalary so for each level to calc properly
        for (Employee t : liste) {
            total = total + t.getSalary();
        }
        total = total + manager.getSalary();//add also the salary of the managed manager
        return total;
    }
    //##########################################################################################################
    // SELLER
    public void calcSalary(Seller seller,List<Sale> liste) {
        seller.setSalary(seller.getSalary() + ((seller.getPercentage()/100)*getTotalAmount(liste)));
        seller.setCalculated(true);
    }
    public double getTotalAmount(List<Sale> sales){
        double total = 0;
        for(Sale s : sales){
            total = total + s.getProduktPrice();
        }
        return total;
    }
}
