import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void main() {
        String actual = HelloWorld.formatMessage("Hello", "world", "%s %s!");
        assertEquals("Hello world!", actual);
    }
}
