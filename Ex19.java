package Exercises;
//Визначити клас Car з полями марка, колір, ціна.
//Створити два конструктори – дефолтний і з параметрами.
//Створити властивість доступу до поля колір.
//Визначити методи Input() –  для введення даних про машину з консолі,
//                               Print() - для виведення даних про машину на консоль
//                               ChangePrice(double x) – для зміни ціни на х%

import java.util.Scanner;

//створити властивість доступу - getter / setter
//Ввести дані про 3 авто, змінити їх ціну на 10%, вивести дані про авто.
//Ввести новий колір і пофарбувати авто з кольором white у вказаний колір
public class Ex19 {
    public static void main(String[] args) {
    Car car1=new Car();
    car1.Input();
    Car car2=new Car();
    car2.Input();
    Car car3=new Car();
    car3.Input();
    car1.Print();
    car2.Print();
    car3.Print();
    car1.ChangePrice();
    car2.ChangePrice();
    car3.ChangePrice();
    System.out.println("Ведіть новий колір");
    Scanner newCol=new Scanner(System.in);
    String newColor=newCol.nextLine();
    car1.ChangeColor(newColor);
    car2.ChangeColor(newColor);
    car3.ChangeColor(newColor);
    }
}
    class Car {
        private String carBrend;
        private String color;
        private double price;


        Car() {
            carBrend = "BMW";
            color = "Black";
            price = 15000;
        }

        Car(String carBrend, String color, double price) {
            this.carBrend = carBrend;
            this.color = color;
            this.price = price;
        }
        Car (String color) {
            this.color=color;
        }
        public void setCarBrend (String carBrend) {
            this.carBrend=carBrend;
        }
        public void setColor (String color) {
            this.color=color;
        }
        public void setPrice (double price) {
            this.price=price;
        }
        public String getCarBrend() {
            return this.carBrend;
        }
        public String getColor() {
            return this.color;
        }
        public double getPrice() {
            return this.price;
        }
        void Input() {
            System.out.println("Ведіть марку, колір та ціну автомобіля");
            Scanner s=new Scanner(System.in);
            this.carBrend=s.nextLine();
            this.color=s.nextLine();
            this.price=s.nextDouble();

        }
        void Print() {
            System.out.printf("Автомобіль %s, колір %s, %.2f\n",carBrend,color,price);
        }
        void ChangePrice() {
            double x=10;
           this.price=(x/100+1)*price;
           this.Print();
        }
        void ChangeColor (String newColor){
            if (this.color=="white") {
                this.color=newColor;
                System.out.printf("Автомобіль %s, колір %s, %.2f\n",carBrend,color,price);
                this.Print();
            }

        }
    }

