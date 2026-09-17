package basicJava;

public class Task5_BlastOff {
    public static String blastOff(int start){
        StringBuilder result = new StringBuilder();
        for (int i = start; i > 0; i--) {
            result.append(i).append(" ");
        }
        result.append("Поехали!");
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(blastOff(7));
        System.out.println(blastOff(30));
        System.out.println(blastOff(-7));
    }
}
