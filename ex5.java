import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Введіть перше число");
        int a=number.nextInt();
        System.out.println("Ведіть друге число");
        int b=number.nextInt();
        if (a % 2==0 && b % 2==0 ) {
            System.out.println("true");
        }
        else if (a % 2!=0 && b % 2!=0 ) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
