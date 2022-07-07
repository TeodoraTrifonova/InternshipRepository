package Shapes;

import java.util.List;

public class Circle implements Shape{
    private int a;

    public Circle() {
    }

    public Circle(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


    @Override
    public void area() {
        System.out.println(3.14*a*a);
    }
}
