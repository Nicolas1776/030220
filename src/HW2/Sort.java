package HW2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class Sort {

        public static void main(String[] args) {
            int[] array = new int[8];
            Random in = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt(8);
            }
            System.out.println("Массив:" + Arrays.toString(array));
            int[] arraySelectionSort = SelectionSort(array);
            System.out.println("Сортировка выбором:" + Arrays.toString(arraySelectionSort));
            int[] arrayBubbleSort = BubbleSort(array);
            System.out.println("Пузырьковая сортировка:" + Arrays.toString(arrayBubbleSort));
            int[] arrayShakerSort = shakerSort(array);
            System.out.println("Шейкерная сортировка:" + Arrays.toString(arrayShakerSort));
            int[] arrayInclusionSort = inclusionSort(array);
            System.out.println("Сортировка с помощью включения:" + Arrays.toString(arrayInclusionSort));
            int[] arrayMergeSort = mergeSort(array, 0, array.length - 1);
            System.out.println("Сортировка слиянием:" + Arrays.toString(arrayMergeSort));
            int[] arraySeparSort = separSort(array, 0, array.length - 1);
            System.out.println("Сортировка с помощью разделения:" + Arrays.toString(arraySeparSort));

            Scanner in2 = new Scanner(System.in);
            System.out.printf("Введите размер массива = ");
            int size = in2.nextInt();
            System.out.printf("\n");
            int[] mas = new int[size];
            for (int i = 1; i <= mas.length; i++) {
                System.out.printf("Введите " + i + " массива: ");
                mas[i - 1] = in2.nextInt();
            }
            System.out.println("Массив:" + Arrays.toString(mas));
            int[] sortArray = separSort(mas, 0, mas.length - 1);
            System.out.println("Отсортированный массив:" + Arrays.toString(sortArray));
            int k = 0;
            for (int j = 0; j < sortArray.length - 1; j++) {
                if (sortArray[j] == sortArray[j + 1]) {
                    k++;
                }
            }
            int p = 0;
            int[] withoutDublArray = new int[sortArray.length - k];
            withoutDublArray[0] = sortArray[0];
            for (int l = 1; l < sortArray.length; l++) {
                if (withoutDublArray[p] != sortArray[l]) {
                    p++;
                    withoutDublArray[p] = sortArray[l];
                }
            }
            System.out.println("Массив без дублей:" + Arrays.toString(withoutDublArray));
        }

        public static int[] SelectionSort(int array[]) {
            for (int i = 0; i < array.length; i++) {
                int min = i;
                for (int j = i; j < array.length; j++) {
                    if (array[j] < array[min]) {
                        min = j;
                    }
                }
                int k = array[i];
                array[i] = array[min];
                array[min] = k;

            }
            return array;
        }

        public static int[] BubbleSort(int array[]) {
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        int k = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = k;
                        flag = true;
                    }
                }
            }
            return array;
        }

        public static int[] shakerSort(int array[]) {
            int left = 0;
            int right = array.length - 1;
            while (left < right) {
                for (int i = left; i < right; i++) {
                    if (array[i] > array[i + 1]) {
                        int k = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = k;

                    }
                }
                right--;
                for (int i = right; i > left; i--) {
                    if (array[i] < array[i - 1]) {
                        int k = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = k;
                    }
                }
                left++;
            }
            return array;
        }

        public static int[] inclusionSort(int array[]) {
            for (int left = 0; left < array.length; left++) {
                int q = array[left];
                int i = left - 1;
                for (; i >= 0; i--) {
                    if (q < array[i]) {
                        array[i + 1] = array[i];
                    } else {
                        break;
                    }
                }
                array[i + 1] = q;
            }
            return array;
        }

        public static int[] mergeSort(int array[], int left, int right) {

            int delimiter = left + ((right - left) / 2) + 1;
            if (delimiter > 0 && right > (left + 1)) {
                mergeSort(array, left, delimiter - 1);
                mergeSort(array, delimiter, right);
            }
            int[] buffer = new int[right - left + 1];
            int cursor = left;
            for (int i = 0; i < buffer.length; i++) {
                if (delimiter > right || array[cursor] > array[delimiter]) {
                    buffer[i] = array[cursor];
                    cursor++;
                } else {
                    buffer[i] = array[delimiter];
                    delimiter++;
                }
            }
            return array;
        }

        public static int[] separSort(int array[], int low, int high) {
            int middle = low + (high - low) / 2;
            int opora = array[middle];

            int i = low, j = high;
            while (i <= j) {
                while (array[i] < opora) {
                    i++;
                }

                while (array[j] > opora) {
                    j--;
                }

                if (i <= j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            if (low < j)
                separSort(array, low, j);

            if (high > i)
                separSort(array, i, high);

            return array;
        }

    }


