package Nasledovanie;
import java.lang.Math.*;

public class Circle implements Figure {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimiter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String info() {
        return "круг с радиусом "+radius;
    }

    @Override
    public double capacity() {
        return 1/(4*Math.PI);
    }
}
