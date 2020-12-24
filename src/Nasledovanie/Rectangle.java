package Nasledovanie;

public class Rectangle extends Parallelogram {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super(width,height);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width*height;
    }

    public String info() {
        return "прямоугольник с шириной "+width+" и высотой "+height;
    }

    public double capacity() {
        return area()/(perimiter()*perimiter());
    }
}
