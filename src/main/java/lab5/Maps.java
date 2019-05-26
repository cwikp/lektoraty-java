package lab5;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Jan Kowalski", 10);
        students.put("Paweł Ćwik", 1337);
        students.put("Andrzej Duda", 69);

        System.out.println(students);

        for (String key : students.keySet()) {
            System.out.println("Key: " + key);
        }

        for (int value : students.values()) {
            System.out.println("Value: " + value);
        }

        int myValue = students.get("Paweł Ćwik");
        System.out.println("\nMy value: " + myValue);

        System.out.println(students.containsKey("Andrzej Duda"));
        students.remove("Andrzej Duda");
        System.out.println(students.containsKey("Andrzej Duda"));
        System.out.println(students);
    }
}
