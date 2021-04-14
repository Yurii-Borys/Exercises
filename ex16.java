package Exercises;
// Перевірити чи введений рік є високосним.

import java.util.Calendar;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        System.out.println("Введіть рік");
        Scanner year_number = new Scanner(System.in);
        int y=year_number.nextInt();
        Calendar a=Calendar.getInstance();
        a.set(y,11,31);
        int days=a.get(Calendar.DAY_OF_YEAR);
        if (days<366) {
        System.out.println(y+ " - є висококосний рік");}
        else {   System.out.println(y+ " -не є висококосний рік");}

    }
}

