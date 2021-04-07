import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        System.out.println("Введіть годину");
        Scanner h = new Scanner(System.in);
        int hours = h.nextInt();
        System.out.println("Веддіть хвилини");
        Scanner m = new Scanner(System.in);
        int minutes = m.nextInt();
        int seconds = hours * 3600 + minutes*60;
        if (seconds >= 0 & seconds < 25200) {
            System.out.println("Добрий ночі");
        } else if (seconds > 25200 & seconds <= 46800) {
            System.out.println("Добрий ранок");
        } else if (seconds > 46800 & seconds <= 64800) {
            System.out.println("Добрий день");
        } else if (seconds>64800 & seconds<=86400){
            System.out.println("Доброї вечір");
        }
    }
}
