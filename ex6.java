import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Введіть радіус кола");
        int a=r.nextInt();
        double len=2* Math.PI*a;
        System.out.println("Довжина кола "+len);
        double sgr=a* Math.PI*a;
        System.out.println("Площа кола "+sgr);
        double vol=4/3*a* Math.PI*a*a;
        System.out.println("Об'єм кулі  "+vol);
    }
}
