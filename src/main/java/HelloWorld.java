public class HelloWorld {

    public static final String HELLO = "Hello";

    private String randomString = "random";

    public static void main(String... args) {
        System.out.println(formatMessage(HELLO, "world"));
    }

    static String formatMessage(String first, String second) {
        return String.format("%s %s!", first, second);
    }
}
