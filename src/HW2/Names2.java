package HW2;

import java.util.Objects;
import java.util.Scanner;

public class Names2 {

    public static void main(String[] args) {
        System.out.printf("Введите Ваше имя: ");
        Scanner in = new Scanner(System.in);
        String name;
        String name1 = "Вася";
        String name2 = "Анастасия";
        name = in.nextLine();

        if (Objects.equals(name, name1) == true){
            System.out.println ("Привет! \n" + "Я тебя так долго ждал.");
        }else {
            if (Objects.equals(name, name2) == true){
                System.out.println("Я тебя так долго ждал.");
            }else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
        System.out.println ("\n");

        if (Objects.equals(name, name1) == true){
            System.out.println ("Привет! \n" + "Я тебя так долго ждал.");
        }else if (Objects.equals(name, name2) == true){
            System.out.println("Я тебя так долго ждал.");
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
        System.out.println ("\n");
        switch (name){
            case "Вася":
                System.out.println ("Привет! \n" + "Я тебя так долго ждал.");
                //System.out.printf("Привет! \n" + "Я тебя так долго ждал");
                break;

            case "Анастасия":
                System.out.println("Я тебя так долго ждал.");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;


        }


    }
}


