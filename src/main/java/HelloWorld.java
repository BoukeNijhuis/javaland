public class HelloWorld {

    private static final String HELLO = "Hello";
    private static final String WORLD = "world";

    public static void main(String... args) {
        System.out.println(formatMessage(HELLO, WORLD, "%s %s!"));
    }

    static String formatMessage(String first, String second, String format) {
        return String.format(format, first, second);
    }
}
