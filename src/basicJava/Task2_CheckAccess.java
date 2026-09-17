package basicJava;

public class Task2_CheckAccess {

    public static String checkAccess(int age) {
        return age > 18 ? "Allowed" : "Denied";
    }

    public static void main(String[] args) {
        System.out.println(checkAccess(19));    // Allowed
        System.out.println(checkAccess(18));    // Denied
        System.out.println(checkAccess(25));    // Allowed
        System.out.println(checkAccess(10));    // Denied
    }
}