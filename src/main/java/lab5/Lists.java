package lab5;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Java-Plum");
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println(fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("First element: " + fruits.get(0));

        for (String fruit : fruits) {
            System.out.println("I have: " + fruit);
        }

        fruits.remove(1);
        fruits.remove("Orange");
        System.out.println("\nAfter removal");
        System.out.println(fruits);

        System.out.println(fruits.contains("Apple")); //true
        System.out.println(fruits.contains("Orange")); //false
    }
}
