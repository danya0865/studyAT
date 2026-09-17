package basicJava;

public class Task7_HasBug {
    public static boolean hasBug(String[] messages) {
        for (String message : messages) {
            if (message.equalsIgnoreCase("Bug")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasBug(new String[]{"Hello", "Bug", "World"}));
        System.out.println(hasBug(new String[]{"Hello", "World"}));
        System.out.println(hasBug(new String[]{"bug"}));
        System.out.println(hasBug(new String[]{}));
    }
}
