public class HelloWorld {

    public static final String HELLO = "Hello";

    private String randomString = "random";

    public static void main(String... args) {
        System.out.println(formatMessage("world", HELLO));
    }

    static String formatMessage(String second, String first) {
        return String.format("%s %s!", first, second);
    }
}
