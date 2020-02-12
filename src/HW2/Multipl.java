package HW2;

import java.util.Scanner;

public class Multipl {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Введите число = ");
        int a = in.nextInt();
        System.out.printf("\n");
        Multipl e = new Multipl();
        System.out.printf("Перемножение от 1 до %d = %d \n", a, e.Multi(a));
        System.out.printf("Перемножение всех цифр числа " + a + " = ");
        System.out.printf(" " + e.Multi2(a) + "\n");
    }

    public int Multi(int a) {
        int r = 1;
        for (int i = 1; i <= a; i++) {
            r = r * i;
        }
        return r;
    }

        public int Multi2 ( int a){
            int l = a;
            int t = 1;
            do {
                int b = l % 10;
                System.out.printf(b + " * ");
                t = t * b;
                l = l / 10;
            } while (l > 0);
            System.out.printf(" = ");
            return t;
        }
    }
