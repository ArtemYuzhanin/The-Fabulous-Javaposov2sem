package Nasledovanie;

public interface Figure {
    double area();
    double perimiter();
    String info();
    static double capacity(Figure f) {
        return f.area()/(f.perimiter()*f.perimiter());
    };

    default double capacity() {
        return area()/(perimiter()*perimiter());
    }
}
