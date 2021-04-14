//read 3 float numbers and check: are they all belong to the range [-5,5]
package Exercises;
import java.util.Locale;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Checking a= new Checking();
        Scanner read = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Веддіть перше число");
        double first = read.nextDouble();
        System.out.println("Веддіть друге число");
        double second = read.nextDouble();
        System.out.println("Веддіть третє число");
        double third = read.nextDouble();
        a.checkData(first);
        a.checkData(second);
        a.checkData(third);

    }
}
    class Checking {
        double check;

        void checkData(double check) {
            this.check = check;
            if (check >= -5 & check <= 5) {
                System.out.println("Число " + check + " знаходиться в діапазоні [-5,5]");
            } else {
                System.out.println("Число " + check + " не знаходиться в діапазоні [-5,5]");
            }
        }
    }

