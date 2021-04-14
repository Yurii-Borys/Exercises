package Exercises;
// Ввести рядок символів. Видрукувати кожен другий символ.

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть рядок символів");
        String r = s.nextLine();
        char [] arr = r.toCharArray();
        System.out.println("Видруковуємо кожен другий символ");
        for (int i = 0; i <= arr.length - 1; i++) {
            i++;
            System.out.println(arr[i]);
        }
    }
}