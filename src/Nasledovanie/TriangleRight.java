package Nasledovanie;

public class TriangleRight implements Figure {
    private final double width;
    private final double height;
    public TriangleRight(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height/2;
    }

    @Override
    public double perimiter() {
        return Math.sqrt(width*width+height*height)+width+height;
    }

    @Override
    public String info() {
        return "прямоугольный треугольник со сторонами "+width+" и "+ height;
    }
}
