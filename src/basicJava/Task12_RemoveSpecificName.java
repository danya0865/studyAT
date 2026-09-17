package basicJava;

import java.util.ArrayList;
import java.util.List;

public class Task12_RemoveSpecificName {

    public static List<String> removeSpecificName(List<String> list, String nameToRemove) {
        List<String> result = new ArrayList<>();

        for (String name : list) {
            if (!name.equals(nameToRemove)) {
                result.add(name);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> list = List.of("Danek", "Igarek", "Sanek", "Pudge");
        String nameToRemove = "Pudge";

        System.out.println("Исходный список: " + list);
        System.out.println("Имя для удаления: " + nameToRemove);
        System.out.println("Список после удаления: " + removeSpecificName(list, nameToRemove));
    }
}