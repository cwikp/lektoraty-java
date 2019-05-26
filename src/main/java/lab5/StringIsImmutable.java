package lab5;

public class StringIsImmutable {

    public static void main(String[] args) {
        String test = "java is weird!";
        test.toUpperCase();
        System.out.println("toUpperCase: " + test.toUpperCase());
        System.out.println("test: " + test);

        String newValue = test.toUpperCase();
        System.out.println("newValue: " + newValue);
    }
}
