package basicJava;

import java.util.List;

public class Task11_CalcAverage {

    public static double calcAverage(List<Integer> list) {
        int sum = 0;

        for (int number : list) {
            sum += number;
        }

        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        System.out.println(calcAverage(List.of(1, 2, 3, 4, 5)));
        System.out.println(calcAverage(List.of(10, 20, 30)));
        System.out.println(calcAverage(List.of(5, 10)));
        System.out.println(calcAverage(List.of(1, 1, 6, 9, 1, 1, 1500)));
    }
}