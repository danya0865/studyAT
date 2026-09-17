package basicJava;

public class Task4_GetGrade {
    public static String checkAccess(int score) {
        if (score >= 0 && score <= 20) {return "E";}
        else if (score >= 21 && score <= 40) {return "D";}
        else if (score >= 41 && score <= 60) {return "C";}
        else if (score >= 61 && score <= 80) {return "B";}
        else if (score >= 81 && score <= 100) {return "A";}
        else {return "Error";}
    }

    public static void main(String[] args) {
        System.out.println(checkAccess(67));    //B
        System.out.println(checkAccess(99));    //A
        System.out.println(checkAccess(21));    //D
        System.out.println(checkAccess(-2003));  //Error
        System.out.println(checkAccess(45));    //C
        System.out.println(checkAccess(13));    //E
    }
}
