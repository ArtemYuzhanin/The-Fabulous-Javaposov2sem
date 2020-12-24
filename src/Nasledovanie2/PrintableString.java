package Nasledovanie2;

public class PrintableString implements Printable{
    private String s;

    public PrintableString(String s) {
        this.s = s;
    }

    @Override
    public void print(){
        System.out.print(s);
    }
}
