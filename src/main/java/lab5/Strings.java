package lab5;

public class Strings {

    public static void main(String[] args) {
        String test = "some value";
        System.out.println(test.length());                              // = 10
        System.out.println(test.charAt(2));                             // = ’m’
        System.out.println(test.substring(0, 4));                       // = ”some”
        System.out.println(test.contains("some"));                      // = true
        System.out.println(test.replace("som", "non"));        // = “none value”

        String other = "AnNoYiNg";
        System.out.println(other.toLowerCase());
        System.out.println(other.toUpperCase());
    }
}
