package Nasledovanie2;

public class PrintableLetter implements Printable{
    private char symbol;
    private int x;
    public PrintableLetter(char symbol, int x) {
        this.symbol = symbol;
        this.x = x;
    }

    @Override
    public void print() {
        for (int i = 1;i<x+1;i++) {
            System.out.print(symbol);
        }
    }
}
