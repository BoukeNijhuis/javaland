public class HelloWorld {

    private static final String HELLO = "Hello";
    private static final String WORLD = "random";

    public static void main(String... args) {
        System.out.println(formatMessage(HELLO, WORLD));
    }

    static String formatMessage(String first, String second) {
        return String.format("%s %s!", first, second);
    }
}
