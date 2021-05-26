package Exercises;
//1) Create abstract class Shape with field name and property Name.
//   Add constructor with 1 parameter  and abstract methods Area() and Perimeter(), which can return area and perimeter of shape;
//   Create classes Circle, Square derived from Shape with field radius (for Circle) and side (for Square).   Add necessary constructors, properties to these classes, override methods from abstract class Shape.
//   a) In Main() create list of Shape, then ask user to enter data of 10 different shapes.  Write name, area and perimeter of all shapes.
//   b) Find shape with the largest perimeter and print its name
import java.awt.*;
import java.util.*;
import java.util.List;

public class ex26 {
    public static void main(String[] args) {
        List <Integer> shape=new ArrayList<>();
        System.out.println("Ведіть сторону квадрата");
        Scanner s=new Scanner(System.in);
        shape.add(s.nextInt());
        System.out.println("Ведіть сторону круга");
        shape.add(s.nextInt());
        Circle c=new Circle("Circle",shape.get(1));
        Square sq= new Square("Square",shape.get(0));
        Map<String,Integer> perimetrAll=new HashMap<>();
        perimetrAll.put(c.getName(), c.Perimeter());
        perimetrAll.put(sq.getName(), sq.Perimeter());

        System.out.println(c.getName()+"- area "+c.Area()+", perimeter -"+c.Perimeter());
        System.out.println(sq.getName()+"- area "+sq.Area()+", perimeter -"+sq.Perimeter());

                
         int max=0;
         String nameMax = null;
         
         
        for (Map.Entry<String, Integer> entry:perimetrAll.entrySet()) {
            if (max<entry.getValue()) {
                max = entry.getValue();
                nameMax = entry.getKey();
            }
        }
        System.out.println("the largest figure is "+nameMax+" -"+max);
    }
}
abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }
    protected Shape() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int Area();
    public abstract int Perimeter();
}

class Circle extends Shape {
    private double radius;
    private final double PI=Math.PI;

    public Circle(String name,int radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int Area() {
        return (int) (PI*Math.pow(radius,2));
    }
    @Override
    public int Perimeter() {
        return (int)(2*PI*radius);
    }
}
class Square extends Shape {
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int Area() {
        return (int)(Math.pow(side,2));
    }

    @Override
    public int Perimeter() {
        return (int)(2*side);
    }
}

