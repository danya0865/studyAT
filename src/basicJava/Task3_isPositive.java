package basicJava;

public class Task3_isPositive {
    public static String checkAccess(int n) {
        return n >= 0 ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(checkAccess(4));   // true
        System.out.println(checkAccess(7));   // true
        System.out.println(checkAccess(-4));  // false
        System.out.println(checkAccess(0));   // true
    }
}
