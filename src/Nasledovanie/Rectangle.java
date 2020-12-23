package Nasledovanie;

public class Rectangle implements Figure {
    private final double width;
    private final double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimiter() {
        return 2*width+2*height;
    }

    @Override
    public String info() {
        return "прямоугольник с шириной "+width+" и высотой "+height;
    }
}
