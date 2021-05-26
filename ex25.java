package Exercises;
//Введіть ім’я персони і знайдіть чи є така персона у вашому списку, якщо так – видрукуйте про неї інформацію
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        System.out.println("Enter name");
        Scanner s=new Scanner(System.in);
        String nameInput=s.nextLine();
        List <Person2> Human=new ArrayList<>();
        Human.add(new Person2("Yura","Bor",33,84.5,184.5));
        Human.add(new Person2("Andr", "Tokar", 33,78.5,178.5));

        for(int i=0;i<Human.size();i++) {
            if (Human.get(i).getName().equals(nameInput)) {
                System.out.println("Your name is "+Human.get(i).getName()+". Your lastname is  "+Human.get(i).getLastName()+". Age-" +Human.get(i).getAge()+ ". Weight -" +Human.get(i).getWeight()+". Height - "+Human.get(i).getWeight()+".");
            }
            else if (i+1==Human.size()){
                System.out.println("Person is out of the list");
            }
        }

    }
}
    class Person2 {
        private String name;
        private String lastName;
        private int age;
        private double weight;
        private double height;

        public Person2(String name, String lastName, int age, double weight, double height) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
    }

