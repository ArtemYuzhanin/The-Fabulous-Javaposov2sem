package MassiveAssociation;

public class Testesting {
    public static void main(String[] args) {
        Transliterator tr = new Transliterator();
        String s = "перепосылающий";
        System.out.println(tr.Trans(s));
        String txt = "распокупочка";
        System.out.println(tr.Trans(txt));
        Pereschet pr = new Pereschet();
        System.out.println(pr.Schet(s));
        Position ps = new Position();
        System.out.println(ps.Pose(s));
    }
}
