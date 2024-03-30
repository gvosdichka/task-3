/*Реализовать бинарный поиск по массиву, не используя рекурсию.*/
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int binarySearch(int[] arr, int key) {
        int index = -10;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            }
            else if (arr[mid] > key) {
                high = mid - 1;
            }
            else if (arr[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void Output(int arr[]) {
        System.out.println(Arrays.toString(arr)); //вывод массива
    }
    public static int[] Input(int length) {
        int[] arr = new int[length];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            int nubmer = s.nextInt(); //вводим число
            arr[i] = nubmer; //добавляем число в массив
        } // массив создан
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
        Scanner s = new Scanner(System.in);
        int length = s.nextInt(); //вводим длину
        int[] arr = Input(length); // создали массив желаемой длины
        Output(arr);

        System.out.println("Введите число, которое хотите найти в массиве: ");
        int key = s.nextInt(); //число которое хотим найти

        //int index = binarySearch(arr, key)
        if (binarySearch(arr, key) == -10) {
            System.out.println("Числа " + key + " нет в массиве");
        }
        else {
            System.out.println("Число " + key + " находится в массиве под индексом " + binarySearch(arr, key)); //применили метод. вывод
        }
    }
}