package encapsulation;

import polymorphism.Car;

public class Example {
    public static void main(String[] args) {

        Student zane = new Student("zane.zvirgzdina");
        System.out.println(zane.getMail());

        zane.setMail("zvirgzdina@lu.lv");
        zane.setName("Zane");
        zane.setLastname("Zvirgzdina");
        zane.setHasMood(true);
        System.out.println(zane.toString());

        Student random = new Student("");
        System.out.println("Random email: " + random.getMail());
        random.setMail("random@lu.lv");
        System.out.println("Random email: " + random.getMail());
        random.setMail("random2@lu.lv");

        Student me = new Student("");
        me.setGraduationYear(2023);
        System.out.printf("Graduation Year: %s\n", me.getGraduationYear());
        me.setGraduationYear(2020);
        System.out.printf("Graduation Year: %s\n", me.getGraduationYear());
        System.out.println("me email: " + me.getMail());



    }



}

