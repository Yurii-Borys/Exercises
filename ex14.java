package Exercises;
//Введіть послідовність додатніх цілих чисел (до першого від’ємного). Обчисліть середнє арифметичне значення введених чисел.
import java.util.Scanner;
import java.util.*;
public class ex14 {
    public static void main(String[] args) {
        System.out.println("Введдіть число");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        ArrayList arr = new ArrayList();
        if (a > 0) {
            arr.add(a);
            while (a > 0) {
                System.out.println("Введдіть число");
                a = s.nextInt();
               if (a>0){
                    arr.add(a);}
            }

        }
        Integer[] arr2 = new Integer[arr.size()];
        int sum=0;
        for (int i = 0; i < arr.size(); i++){
            arr2[i] = (Integer) arr.get(i);
            sum=(sum+arr2[i]);
        }

            System.out.println("Cереднє арифметичне значення введених чисел " +sum/ arr2.length);
    }
}
