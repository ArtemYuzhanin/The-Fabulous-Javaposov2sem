package CollectionOfTasks;

import java.util.*;

public class FirstList {
    public static void main(String[] args) {

        //System.out.println(FirstTaskHundred());

        List<String> one = new ArrayList<>();
        one.add("10");
        one.add("20");
        one.add("30");
        List<String> two = new ArrayList<>();
        two.add("5");
        two.add("15");
        two.add("25");
        //System.out.println(FourthTaskPartOne(SecondTaskUnite(one,two)));

        //List<String> pi = SecondTaskUnite(one,two);
        //FifthTaskFirstPartTwo(pi);
        //FifthTaskTwoPartTwo(pi);
        List<Integer> pi = new ArrayList<>();
        pi.add(35);
        pi.add(42);
        pi.add(64);
        pi.add(71);
        pi.add(29);
        pi.add(10);
        FifthTaskThreePartTwo(pi);
        System.out.println(pi);

    }

    public static List<Integer> FirstTaskHundred() {
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i < 101; i++)
            a.add(i);
        return a;
    }

    public static List<String> SecondTaskUnite(List<String> a,List<String> b) {
        List<String> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        return c;
    }

    public static List<String> FourthTaskPartOne(List<String> a) {
        List<String> out = a;
        Collections.reverse(out);
        return out;
    }

    public static void FourthTaskPartTwo(List<String> a) {
        Collections.reverse(a);
    }

    public static List<String> FifthTaskFirstPartOne(List<String> a) {
        List<String> out = a;
        int count = 0;
        while (count < out.size()) {
            out.remove(count);
            count++;
        }
        return out;
    }

    public static void FifthTaskFirstPartTwo(List<String> a) {
        int count = 0;
        while (count < a.size()) {
            a.remove(count);
            count++;
        }
    }

    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public  static List<String> FifthTaskTwoPartOne(List<String> a) {
        List<String> out = a;
        String ch;
        for (int i = 0; i < out.size(); i++) {
            ch = out.get(i);
            if (isInteger(ch)) {
                if (((Integer.parseInt(ch)) % 2) == 0) {
                    out.remove(i);
                    i = i - 1;
                }
            }
        }
        return out;
    }

    public static void  FifthTaskTwoPartTwo(List<String> a) {
        String ch;
        for (int i = 0; i < a.size(); i++) {
            ch = a.get(i);
            if (isInteger(ch)) {
                if (((Integer.parseInt(ch)) % 2) == 0) {
                    a.remove(i);
                    i = i-1;
                }
            }
        }
    }

    public static List<Integer> FifthTaskThreePartOne(List<Integer> a) {
        List<Integer> out = new ArrayList<>();
        int ch;
        for (int i = 0; i < out.size(); i++) {
            ch = out.get(i);
            if ((ch % 2) == 0) {
                out.remove(i);
                i = i - 1;
            }
        }
        return out;
    }

    public static void FifthTaskThreePartTwo(List<Integer> a) {
        int ch;
        for (int i = 0; i < a.size(); i++) {
            ch = a.get(i);
            if ((ch % 2) == 0) {
                a.remove(i);
                i = i - 1;
            }
        }
    }



}