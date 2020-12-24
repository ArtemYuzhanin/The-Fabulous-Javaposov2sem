package Nasledovanie;

public class TriangleRight extends Triangle {
    private final double width;
    private final double height;

    public TriangleRight(double width, double height) {
        super(width,height,Math.sqrt(width*width+height*height));
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height/2;
    }

    @Override
    public String info() {
        return "прямоугольный треугольник со сторонами "+width+" и "+ height;
    }
}
