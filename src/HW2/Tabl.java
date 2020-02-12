package HW2;

public class Tabl {

    public static void main(String[] args) {

        // чтобы первые 4 столбца  не были кривыми, часть таблицы реализуем через массив
        int[] numbers = new int[9];

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        for (int i = 1; i < 2; i++)
            System.out.println("2 x " + numbers[i] + " = " + numbers[i] * 2 + "     " + "3 x " + numbers[i] + " = " + numbers[i] * 3 + "     " + "4 x " + numbers[i] + " = " + numbers[i] * 4 + "     " + "5 x " + numbers[i] + " = " + numbers[i] * 5);
        for (int i = 2; i < 3; i++)
            System.out.println("2 x " + numbers[i] + " = " + numbers[i] * 2 + "     " + "3 x " + numbers[i] + " = " + numbers[i] * 3 + "     " + "4 x " + numbers[i] + " = " + numbers[i] * 4 + "    " + "5 x " + numbers[i] + " = " + numbers[i] * 5);
        for (int i = 3; i < 4; i++)
            System.out.println("2 x " + numbers[i] + " = " + numbers[i] * 2 + "     " + "3 x " + numbers[i] + " = " + numbers[i] * 3 + "    " + "4 x " + numbers[i] + " = " + numbers[i] * 4 + "    " + "5 x " + numbers[i] + " = " + numbers[i] * 5);
        for (int i = 4; i < numbers.length; i++)
            System.out.println("2 x " + numbers[i] + " = " + numbers[i] * 2 + "    " + "3 x " + numbers[i] + " = " + numbers[i] * 3 + "    " + "4 x " + numbers[i] + " = " + numbers[i] * 4 + "    " + "5 x " + numbers[i] + " = " + numbers[i] * 5);

        System.out.println(" ");

            for (int q = 2; q < 10; q++) {
                for (int w = 6; w < 10; w++) {
                    System.out.printf(w + " x " + q + " = " + w * q + "    ");
                }
                System.out.printf("\n");
            }

    }
}
