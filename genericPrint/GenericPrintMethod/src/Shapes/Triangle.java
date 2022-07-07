package Shapes;

public class Triangle implements Shape{
    private int a;
    private int h;

    public Triangle() {
    }

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void area() {

        System.out.println((a*h)/2);
    }
}
