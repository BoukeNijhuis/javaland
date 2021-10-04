import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void main() {
        String actual = HelloWorld.formatMessage("world", "Hello");
        assertEquals("Hello world!", actual);
    }
}
