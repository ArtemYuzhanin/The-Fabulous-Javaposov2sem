package Nasledovanie;

public class Rhombus implements Figure {
    private final double width;
    private final double height;
    public Rhombus(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height/2;
    }

    @Override
    public double perimiter() {
        return Math.sqrt(width*width+height*height)*2;
    }

    @Override
    public String info() {
        return "ромб с диагоналями "+width+" и "+height;
    }
}
