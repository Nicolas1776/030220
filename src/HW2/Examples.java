package HW2;

public class Examples {

    public static void main(String[] args) {

        int q=2;float w=8;
        double x = 5 + q/w;
        System.out.println(x);
        double y = (5 + q) / w;
        System.out.println(y);
        int a = 2; int b = 8;
        int t = (5 + a++) / b;
        System.out.println(t);
        int r = (5 + a++) / --b;
        System.out.println(r);
        int u = (5 + 2 >> q++) / --b;
        System.out.println(u);
        int i = (5 + 7 > 20 ? 68 : 22 * 2 >> q++) / --b;
        System.out.println(i);
        boolean o = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(o);
        boolean p = true && false;
        System.out.println(p);

    }
}
