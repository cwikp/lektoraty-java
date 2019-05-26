package lab5;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Java-Plum");
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println(fruits);
        System.out.println("Size: " + fruits.size());

        for (String fruit : fruits) {
            System.out.println("I have: " + fruit);
        }

        fruits.remove("Orange");
        System.out.println("\nAfter removal");
        System.out.println(fruits);

        System.out.println(fruits.contains("Apple")); //true
        System.out.println(fruits.contains("Orange")); //false
    }
}
