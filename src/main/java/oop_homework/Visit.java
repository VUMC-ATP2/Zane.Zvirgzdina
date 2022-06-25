package oop_homework;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Visit {

    public Customer customer;
    public Date date;
    public double serviceExpense;
    public double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getCustomer() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense * (1 -DiscountRate.getServiceDiscountRate(customer.getMemberType()));
    }

    public double getProductExpense() {
        return productExpense * (1 -DiscountRate.getProductDiscountRate(customer.getMemberType()));

    }

    public double getTotalExpense() {
        return (serviceExpense * (1 -DiscountRate.getServiceDiscountRate(customer.getMemberType()))) + (productExpense * (1 -DiscountRate.getProductDiscountRate(customer.getMemberType())));
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }

}
