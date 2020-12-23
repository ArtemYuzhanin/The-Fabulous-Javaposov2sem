package Nasledovanie;

public class Square implements Figure{
    private final double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimiter() {
        return 4*side;
    }

    @Override
    public String info() {
        return "квадрат со стороной "+side;
    }
}
