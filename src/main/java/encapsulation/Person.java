package encapsulation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// if you know that all variables will have Getters & Setters
// you can put
// @Getter
// @Setter
// before class definition line
@ToString
// var arī izlaist kādus variables no To String metodes @ToString(exclude = "name")
public class Person {

    @Getter
    @Setter
    protected String name = "John";

    @Getter
    @Setter
    protected String lastname = "Doe";


    @Getter
    @Setter
    private boolean hasMood;
}
