package Exercises;
//Enter 10 integer numbers. Culculate the sum of first 5 elements if they are posetive or product of last 5 element in the other case.

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Integer[] ten_numbers = new Integer[10];
        int num = 1;
        for (int i = 0; i < ten_numbers.length; i++) {
            System.out.println("Введіть " + num + " число");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            ten_numbers[i] = n;
            num++;
        }
        Integer[] five_number = new Integer[5];
        for (int c = 0; c < ten_numbers.length - 5; c++) {
                five_number[c] = ten_numbers[c];
        }


        int k=5;
        for (int w:five_number) {
            if (w<=0) {
                k--; }
        }

       if (k<5) {
           int product = 1;
           for (int a = 5; a < ten_numbers.length; a++) {
               product *= ten_numbers[a];
           }
           System.out.println(product);
       }
       else {
           int sum = 1;
           for (int g = 0; g < five_number.length; g++) {
               sum += ten_numbers[g];
           }

           System.out.println(sum);
       }




        }
    }


