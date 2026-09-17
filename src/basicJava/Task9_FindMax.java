package basicJava;

public class Task9_FindMax {

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1, 5, 3, 9, 2}));
        System.out.println(findMax(new int[]{-5, -2, -10, -1}));
        System.out.println(findMax(new int[]{100}));
    }
}