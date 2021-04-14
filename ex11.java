package Exercises;
//3 3.1. Ввести a та b – два цілих числа. Порахувати скільки цілих чисел з діапазону [a..b] діляться на 3 без остачі.



import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Веддіть число a");
        int a = s.nextInt();
        System.out.println("Введіть число b");
        int b = s.nextInt();
        int count = 0;

        if (a > b) {
            for (int i = b; i <= a; i++) {
                int number = i % 3;
                if (number == 0) {
                    count++;
                }
            }
            System.out.println(count + " цілих чисел з діапазону [" + a + ".." + b + "] діляться на 3 без остачі");
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                int number = i % 3;
                if (number == 0) {
                    count++;
                }
            }
            System.out.println(count + " цілих чисел з діапазону [" + a + ".." + b + "] діляться на 3 без остачі");
        }


    }
}


