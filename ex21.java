package Exercises;
// 2. Create Console Application project in VS.
//    A) Add to class method  static void TestList() and put in it code for solving next tasks:
//        1) Declare List myColl of integers and fill it from Console by 10 integer numbers.
//        2) Find and print all positions of element -10 in the list
//        3) Remove from list elements, which are greater then 20. Print list
//        4) Insert elements 1,-3,-4 in the positions 2, 8, 5. Print list
//        5) Sort and print list
//    B)Add to class method  static void TestArrayList() and static void TestSortedList() for solving the same tasks
//    C) In the method Main() Call developed methods TestList(), TestArrayList(), TestSortedList()
import java.util.*;

public class ex21 {
    public static void main(String[] args) {
        Start.TestLis();
    }
}
        class Start {
            public static void TestLis() {
                List<Integer> myColl = new ArrayList<Integer>();
                for (int i = 0; i < 10; i++) {
                    Scanner s = new Scanner(System.in);
                    System.out.println("Введіть число");

                    myColl.add(s.nextInt());

                }
                System.out.println(myColl);
                System.out.println("---");
                List<Integer> newListRemowe = new ArrayList<Integer>();
                for (Integer x : myColl) {
                    if (x > 20) {
                        newListRemowe.add(x);
                    }
                }
                myColl.removeAll(newListRemowe);
                System.out.println(myColl);
                System.out.println("---");

                myColl.set(2, 1);
                myColl.set(8, -3);
                myColl.set(5, -4);
                System.out.println(myColl);

                Collections.sort(myColl, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1-o2;
                    }
                });
                System.out.println(myColl);


            }
        }


