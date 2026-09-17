package basicJava;

public class Task8_GetEvenInRange {

    public static String getEvenInRange(int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getEvenInRange(2, 5));
        System.out.println(getEvenInRange(1, 10));
        System.out.println(getEvenInRange(3, 7));
        System.out.println(getEvenInRange(5, 5));
    }
}