package Exercises;

import java.util.Scanner;

// Read the text as a string value and culculate the counts of characters 'a', 'o', 'i', 'e' in this text.
public class ex17 {
    public static void main (String[] args) {
        System.out.println("Напишіть слово");
        Scanner s=new Scanner(System.in);
        String worlds=s.nextLine();
        char[] worlds_arr=worlds.toCharArray();

        for (int i=0; i<worlds_arr.length;i++) {
            char name=worlds_arr[i];
            int number=0;
            for (int j=0; j<worlds_arr.length;j++) {
                if (name == worlds_arr[j]) {
                    number++;
                }

            }
            System.out.println(name+" has "+ number);
        }
    }
}
