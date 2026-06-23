package notes.lec4;

public class ReturnString {
    public static void main(String[] args) {
        String message = greeting();
        System.out.println(message);
}
   static String greeting() {
        String greeting = "Hello, World!";
        return greeting;
    }
}
