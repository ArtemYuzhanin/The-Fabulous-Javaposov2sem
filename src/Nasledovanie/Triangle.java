package Nasledovanie;

public class Triangle implements Figure{
    private final double side1;
    private final double side2;
    private final double side3;
    private final double halfper = perimiter()/2;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double perimiter() {
        return side1+side2+side3;
    }

    public double area() {
        return Math.sqrt(halfper*(halfper-side1)*(halfper-side2)*(halfper-side3));
    }

    public String info() {
        return "треугольник со сторонами "+side1+" , "+side2+" и "+side3;
    }
}
