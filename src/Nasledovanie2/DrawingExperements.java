package Nasledovanie2;

public class DrawingExperements {
    public static void main(String[] args) {
        Drawing d = new Drawing(10,20,'*');
        d.setPoint(5,5,'A');
        d.drawHorizontalLine(7, 6,10,'_');
        d.drawVerticalLine(3,4,8,'|');
        d.drawRectangle(5,2,9,4,'Q');
        d.drawCircle(16,5,3,'L');


        Drawing c = new Drawing(7,8,'@');
        d.draw(7,3,c);

        PrintableLetter a = new PrintableLetter('x',10);


        PrintableString b = new PrintableString("Hello World!!!");

        Printable[] printi = new Printable[5];
        printi[0] = d;
        printi[1] = a;
        printi[2] = b;
        printi[3] = new Printable() {
            @Override
            public void print() {
                System.out.print(Math.floor(Math.random()*10));
            }
        };
        printi[4] = () -> System.out.println("ЛЯМБПВТГРСНМАДА");

        for (int i = 0;i<5;i++) {
            printi[i].print();
            System.out.println();
        }
    }

}
