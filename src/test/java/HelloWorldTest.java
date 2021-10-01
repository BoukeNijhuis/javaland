import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void main() {
        assertEquals("Hello world!", HelloWorld.formatMessage("Hello", "world"));
    }
}