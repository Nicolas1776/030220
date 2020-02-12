package HW2;

import java.util.Scanner;

public class Mass {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Введите размер массива = ");
        int size = in.nextInt();
        System.out.println("\n");
        int[] mas = new int[size];
        for (int i = 1; i <= mas.length; i++) {
            System.out.printf("Введите " + i + " массива: ");
            mas[i - 1] = in.nextInt();
        }
        if (mas.length > 0) {
            System.out.println("через do....while");
            int e = 0;
            do {
                System.out.printf(mas[e] + "  ");
                e++;
            } while (e < mas.length);
            System.out.println("\n");
            System.out.println("через While");
            int k = 0;
            while (k < mas.length) {
                System.out.printf(mas[k] + "  ");
                k++;
            }
            System.out.println("\n");


            System.out.println("через for");
            for (int i = 0; i < mas.length; i++) {
                System.out.printf(mas[i] + "  ");
            }
            System.out.println(" ");
            System.out.println("через foreach");

            for (int i : mas) {
                System.out.printf(i + "  ");
            }
            System.out.printf("\n");
        } else System.out.println("Массив пуст");

//2.2 Вывести каждый второй элемент массива
        System.out.println("Каждый второй элемент");
        for (int i = 1; i < mas.length; i = i + 2) {
            System.out.printf(mas[i] + "  ");
        }
    }

}
