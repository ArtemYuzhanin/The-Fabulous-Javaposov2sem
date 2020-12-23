package Nasledovanie;

public class Square extends Parallelogram{
    private final double side;
    public Square(double side) {
        super(side,side);
        this.side = side;
    }

    public double area() {
        return side*side;
    }

    public String info() {
        return "квадрат со стороной "+side;
    }

    @Override
    public double capacity() {
        return 0.0625;
    }
}
