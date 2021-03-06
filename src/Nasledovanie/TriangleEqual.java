package Nasledovanie;

public class TriangleEqual extends Triangle {
    private final double side;

    public TriangleEqual(double side) {
        super(side,side,side);
        this.side = side;
    }

    @Override
    public double area() {
        return Math.sqrt(3)/4*side*side;
    }

    @Override
    public double perimiter() {
        return side*3;
    }

    @Override
    public String info() {
        return "равносторонний треугольник со стороной "+side;
    }

    @Override
    public double capacity() {
        return 1/(12*Math.sqrt(3));
    }
}
