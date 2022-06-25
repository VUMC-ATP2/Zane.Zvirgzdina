package encapsulation;

import lombok.Getter;
import lombok.ToString;

import java.time.Year;
import java.util.Calendar;

@ToString(callSuper = true)
public class Student extends Person {

    @Getter
    public int graduationYear;
    private final String MAIL_DOMAIN = "@lu.lv";
    @Getter
    private String mail;

    public Student(String accountName) {
        mail = accountName + MAIL_DOMAIN;
        // ja account name = zane.zvirgzdina
        // mail = zane.zvirgzdina@lu.lv
    }



    public void setMail(String mail) {
        if (this.mail.equals("@lu.lv")) {
            this.mail = mail;
        } else {
            System.out.printf("Your email is: %s which is correct one, and it will not be changed\n", this.mail);
        }
    }

    // Create getter/setter for graduationYear
    // if graduationYear > 2022, then print message that Value cannot be set
    // Example class -> set graduation year to 2020, get it and print it
    // Set graduation year 2023;

    public void setGraduationYear(int graduationYear) {
        int currentYear = Year.now().getValue();
        if (graduationYear > currentYear) { // in order to not change manually year when it changes, can use Year.now().getValue()
            System.out.println("The Value cannot be set: " + currentYear);
        } else {
            this.graduationYear = graduationYear;
        }
    }



}
