package Exercises;


import java.util.Scanner;

public class ex10part2 {

        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            System.out.println("Веддіть перше число");
            int first = read.nextInt();
            System.out.println("Веддіть друге число");
            int second = read.nextInt();
            System.out.println("Веддіть третє число");
            int third = read.nextInt();
            System.out.println("Мінімальне число " +Math.min(first,Math.min(second,third)));
            System.out.println("Максимальне число "+Math.max(first,Math.max(second,third)));
            System.out.println("Другий метод");
            int[] nums = new int[] {first, second, third};
            int min = nums[0];
            int max = nums[0];
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] < min) {
                    min = nums[i];
                }
                if(nums[i] > max) {
                    max = nums[i];
                }
            }
            System.out.println("Мінімальне число " +min);
            System.out.println("Максимальне число "+max);
            }
}




