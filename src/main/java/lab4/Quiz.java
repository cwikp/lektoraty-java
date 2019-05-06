package lab4;

public class Quiz {

//  1
    public static void main(String[] args) {
        System.out.println(something());
    }

    private static String something() {
        return "Apples";
    }

//    2
//    public static void main(String[] args) {
//        System.out.println(somethingElse());
//    }
//
//    private int somethingElse() {
//        return 101;
//    }
}

//3
//class Quiz{
//    private void something(){
//        System.out.println("something");
//    }
//}
//
//class Mainn{
//    public static void main(String[] args) {
//        Quiz quiz = new Quiz();
//        quiz.something();
//    }
//}

//4
//class Quiz{
//    void something(int a){
//        System.out.println("int");
//    }
//    void something(String a){
//        System.out.println("string");
//    }
//}
//
//class Mainn{
//    public static void main(String[] args) {
//        Quiz quiz = new Quiz();
//        quiz.something(123);
//    }
//}

////5
//abstract class Base {
//    void something() {
//        System.out.println("base");
//    }
//}
//
//class Extended extends Base {
//    void something() {
//        System.out.println("something");
//    }
//}
//
//class Quiz {
//    public static void main(String[] args) {
//        Base extended = new Extended();
//        extended.something();
//    }
//}