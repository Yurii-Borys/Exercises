package Exercises;
//Ask user to enter the number of mounth. Read the value and write the amount of days in this mounth

import java.time.Month;
import java.util.Scanner;

public class ex15 {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Введіть номер місяця у році");
        int name=s.nextInt();
        Month day=Month.of(name);
        System.out.println("У "+day.name()+" місяці "+ day.length(false) +" днів");
    }

}
