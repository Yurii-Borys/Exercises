package Exercises;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
    Person person1=new Person();
    Person person2=new Person();
    Person person3=new Person();
    Person person4=new Person();
    Person person5=new Person();
    person1.Input();
    person2.Input();
    person3.Input();
    person4.Input();
    person5.Input();

    }
}
class Person {
    private String name;
    private int birthYear;

    Person() {
        name = "Yura";
        birthYear = 1988;
    }

    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    void setName(String name) {
        this.name = name;
    }

    void Input() {
        System.out.println("Введіть імя та рік народження");
        Scanner s = new Scanner(System.in);
        this.name = s.nextLine();
        this.birthYear = s.nextInt();
        this.Age();
    }

    void Output() {
        System.out.printf("Your name %s, your birth %d\n", name, birthYear);
    }

    void Age() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int thisYear = localDate.getYear();
        int thisYear2 = thisYear - this.birthYear;
        if (thisYear2 < 16) {
            String newName = "Very young";
            this.ChangeName(newName);
        }
        System.out.printf("Your name is %s, your age %d\n", name, thisYear2);
    }

    void ChangeName(String name) {

        this.setName(name);
    }
}
