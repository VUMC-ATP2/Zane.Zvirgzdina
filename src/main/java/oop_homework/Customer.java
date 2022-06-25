package oop_homework;

import lombok.Getter;
import lombok.Setter;

public class Customer {

    @Getter
    private String name;
    @Setter
    private boolean member = false;
    @Getter @Setter
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return this.member = true;
    }

    @Override
    public String   toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }

}
