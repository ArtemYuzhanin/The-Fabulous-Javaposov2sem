package Nasledovanie;

public class FiguresExamples {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        figures[1] = new Circle(8);
        figures[2] = new Square(8);
        figures[3] = new Rectangle(8,10);
        figures[4] = new Rhombus(8, 10);
        figures[5] = new TriangleEqual(8);
        figures[0] = new TriangleRight(8,10);

        for (Figure figura : figures ) {
            System.out.println(figura.info() + " а его площадь - " + String.format("%.2f", figura.area())+" а его периметр - "+String.format("%.2f", figura.perimiter())+" а уж его емкость - "+Figure.capacity(figura)+" или - "+figura.capacity());
        }
    }
}
