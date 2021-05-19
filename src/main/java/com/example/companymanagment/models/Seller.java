package com.example.companymanagment.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "sellerid")
public class Seller extends Employee{


//    public Seller(String name, String surname, String email, String birthday, double salary, double percentage, char type) {
//        super(name, surname, email, birthday, salary, percentage, type);
//    }
//    @OneToMany(targetEntity = Sale.class, mappedBy="Seller")
//    private List<Sale> sales;
    public Seller() {

    }

    @Override
    public void calcSalary() {
        this.setSalary(getSalary() + ((this.getPercentage()/100)*getTotalAmount()));
        this.setCalculated(true);
    }
//    public double getTotalAmount(){
//        double total = 0;
//        for(Sale s : sales){
//            total = total + s.getProduktPrice();
//        }
//        return total;
//    }
//    public void addSold(Sale sale){
//        this.sales.add(sale);
//    }
    @Override
    public double getTotalAmount(Manager manager) {
        return 0;
    }
}
