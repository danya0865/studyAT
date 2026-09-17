package basicJava;

import java.util.Arrays;

public class Task10_Reverse {

    public static String[] reverse(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"One", "Two", "Zero", "3"};

        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Перевёрнутый массив: " + Arrays.toString(reverse(arr)));
    }
}