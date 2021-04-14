package Exercises;

import java.util.Scanner;

// Ввести назву напитку (кава, чай, сік, вода).Вивести назву напитку і його ціну
public class ex13 {
    public static void main(String[] args) {
        System.out.println("Введдіть назву напитку (кава, чай, сік, вода).");
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        switch (name) {
            case ("чай"): {
                System.out.println("Чай коштує 10.5 грн.");
            }
            break;
            case ("кава"): {
                System.out.println("Кава коштує 12.5 грн.");

            break; }
            case ("сік"): {
                System.out.println("Cік коштує 14.5 грн.");

            break;}
            case ("вода"): {
                System.out.println("Вода коштує 5.5 грн.");

                break;}
        }
    }
}
