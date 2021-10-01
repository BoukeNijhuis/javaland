public class HelloWorld {

    public static void main(String... args) {
        System.out.println(formatMessage("Hello", "world"));
    }

    static String formatMessage(String first, String second) {
        return String.format("%s %s!", first, second);
    }
}
