package Exercises;

import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.util.*;



public class ex23 {


    public static void main(String[] args) throws Exception {
       ReadNumber(1,10);
    }


    static void ReadNumber(int start, int end) throws  ArgumentOutOfRangeExeption{
        int[] number = new int[10];
        for (int i = 0; i <= 10; i++) {

                System.out.println("Ведіть номер");
                Scanner s = new Scanner(System.in);
                number[i] = s.nextInt();
                if (s.nextInt() < start || s.nextInt() > end) {
                    throw new ArgumentOutOfRangeExeption("Число виходить за діапазон 1..100");
                }
            start = number[i];
        }
    }


}
class ArgumentOutOfRangeExeption extends Exception {

    public ArgumentOutOfRangeExeption(String massage) {
        super(massage);
    }
}







