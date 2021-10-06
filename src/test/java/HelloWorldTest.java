import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void main() {
        String actual = HelloWorld.formatMessage("Hello", "world");
        assertEquals("Hello world!", actual);
    }
}
