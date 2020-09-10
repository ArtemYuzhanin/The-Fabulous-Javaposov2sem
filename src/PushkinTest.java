import java.util.Scanner;

public class PushkinTest {
    public static void main(String[] args) throws Exception {
        //Scanner in = new Scanner(System.in);
        //String a = in.next();
        Scanner stih = new Scanner("Гроза промчалась низко над землёю…\nЯ вышел в сад; затихло всё кругом —\nВершины лип облиты мягкой мглою,\nОбагрены живительным дождём.\nА влажный ветр на листья тихо дышит…\nВ тени густой летает тяжкий жук;\nИ, как лицо заснувших томно пышет,\nПахучим паром пышет тёмный луг.");
        int count = 1;
        String ns = stih.nextLine();
        System.out.println(ns);

        ns = stih.nextLine();
        System.out.println(ns);

        ns = stih.nextLine();
        System.out.println(ns);

        System.out.println(count);
    }
}
