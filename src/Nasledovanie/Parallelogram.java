package Nasledovanie;

public abstract class Parallelogram implements Figure{
    private final double width;
    private final double height;
    public Parallelogram(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double perimiter() {
        return 2*width+2*height;
    }

    public abstract double area();

    public abstract String info();
}
