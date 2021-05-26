package Exercises;

import javax.swing.*;
import java.util.*;

//Утворити і заповнити колекцію з 10 цілих чисел
//Отримати і вивести на консоль тільки від’ємні числа
// Отримати і вивести на консоль тільки додатні парні числа
//Отримати найбільший та найменший елементи з масиву, а також суму всіх елементів.
//Отримати перший елемент з масиву, який є менший ніж середнє арифметичне значення елементів масиву
//Посортувати масив з використанням OrderBy
public class ex27 {


    public static void main(String[] args) {

        int [] num=enterTheNumber();
        System.out.println(Arrays.toString(num));
        System.out.println(positiveNumber(num,ExspressionHelper::isPositive));
        System.out.println(positiveNumber(num,a -> a>0 & a%2==0 ));
        System.out.println(Arrays.stream(num).max().getAsInt() + " " +Arrays.stream(num).min().getAsInt() + " " +Arrays.stream(num).sum());
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        int avarageNum= Arrays.stream(num).sum()/num.length;
        System.out.println(avarageNum);
        System.out.println(Arrays.toString(positiveNumber(num, a -> a < avarageNum).stream().findFirst().stream().toArray()));
    }




public static int[] enterTheNumber () {
    int [] number=new int[10];
    System.out.println("Ведіть 10 любих чисел");
    Scanner s=new Scanner(System.in);
    for (int i=0; i<10;i++) {
        number[i]=s.nextInt();
    }
    return number;
        }
public static List<Integer> positiveNumber (int [] num, Expression func) {
    List <Integer> positiveNum= new ArrayList<>();

    for (int n:num ) {
        if(func.isQqual(n)) {
            positiveNum.add(n);
        }

    }

    return positiveNum;
}
}
class ExspressionHelper {
    static boolean isPositive (int a) {
        return a>0;
    };

}

interface Expression {
    boolean isQqual(int a);
}