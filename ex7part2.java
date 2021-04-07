import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ex7part2 {
    public static void main(String[] args) {
        System.out.println("Введіть годину");
        Scanner h = new Scanner(System.in);
        int hours = h.nextInt();
        System.out.println("Веддіть хвилини");
        Scanner m = new Scanner(System.in);
        int minutes = m.nextInt();
        long second = TimeUnit.HOURS.toSeconds(hours)+TimeUnit.MINUTES.toSeconds(minutes);
        if (second >= 0 & second < 25200) {
            System.out.println("Добрий ночі");
        } else if (second > 25200 & second <= 46800) {
            System.out.println("Добрий ранок");
        } else if (second > 46800 & second <= 64800) {
            System.out.println("Добрий день");
        } else if (second>64800 & second<=86400){
            System.out.println("Доброї вечір");
        }
    }
}
