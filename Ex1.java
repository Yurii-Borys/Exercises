import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.print("Ведіть число а ");
        int a = in.nextInt();
        System.out.print("Ведіть число а ");
        int b = in.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((double) a/b);
    }
}
