package oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {

        Customer user1 = new Customer("Liene");
        user1.isMember();
        user1.setMemberType("Premium");
        System.out.println("Customer name: " + user1.getName() + ". Membership level: " + user1.getMemberType());
        Visit visit1 = new Visit(user1, new Date());
        visit1.setServiceExpense(20.0);
        visit1.setProductExpense(20.0);
        System.out.println("Total amount for paying: " + visit1.getTotalExpense());
        System.out.println("Purchase details: " + visit1);

        System.out.println("-------------------------");

        Customer user2 = new Customer("Laila");
        System.out.println("Customer name: " + user2.getName() + ". Membership level: " + user2.getMemberType());
        Visit visit2 = new Visit(user2, new Date());
        visit2.setServiceExpense(100.0);
        visit2.setProductExpense(100.0);
        System.out.println("Total amount for paying: " + visit2.getTotalExpense());
        System.out.println("Purchase details: " + visit2);

        System.out.println("-------------------------");

        Customer user3 = new Customer("Ludmila");
        user3.isMember();
        user3.setMemberType("Gold");
        System.out.println("Customer name: " + user3.getName() + ". Membership level: " + user3.getMemberType());
        Visit visit3 = new Visit(user3, new Date());
        visit3.setServiceExpense(50.0);
        visit3.setProductExpense(50.0);
        System.out.println("Total amount for paying: " + visit3.getTotalExpense());
        System.out.println("Purchase details: " + visit3);

        System.out.println("-------------------------");

        Customer user4 = new Customer("Lora");
        user4.isMember();
        user4.setMemberType("Silver");
        System.out.println("Customer name: " + user4.getName() + ". Membership level: " + user4.getMemberType());
        Visit visit4 = new Visit(user4, new Date());
        visit4.setServiceExpense(0.0);
        visit4.setProductExpense(50.0);
        System.out.println("Total amount for paying: " + visit4.getTotalExpense());
        System.out.println("Purchase details: " + visit4);

    }
}
