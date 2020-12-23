package Nasledovanie;

public class Rhombus extends Parallelogram {
    private final double width;
    private final double height;

    public Rhombus(double width, double height) {
        super(Math.sqrt(width*width+height*height)/2,Math.sqrt(width*width+height*height)/2);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width*height/2;
    }

    public String info() {
        return "ромб с диагоналями "+width+" и "+height;
    }
}
