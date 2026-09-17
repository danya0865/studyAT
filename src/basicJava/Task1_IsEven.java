package basicJava;

public class Task1_IsEven {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));   // true
        System.out.println(isEven(7));   // false
        System.out.println(isEven(-4));  // true
        System.out.println(isEven(0));   // true
    }
}