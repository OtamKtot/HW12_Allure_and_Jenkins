package simpleTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class NegativeTests {

    @Test
    @DisplayName("Условный негативный тест")
    void someTest() {
        assertTrue(false);
    }

    @Test
    @DisplayName("Условный негативный тест1")
    void someTest1() {
        assertTrue(false);
    }

    @Test
    @DisplayName("Условный негативный тест2")
    void someTest2() {
        assertTrue(false);
    }
}