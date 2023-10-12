package simpleTests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class DisabledTests {

    @Test
    @Disabled
    @DisplayName("Условный тест")
    void someTest() {
        assertTrue(false);
    }

    @Test
    @Disabled
    @DisplayName("Условный тест1")
    void someTest1() {
        assertTrue(false);
    }

    @Test
    @Disabled
    @DisplayName("Условный тест2")
    void someTest2() {
        assertTrue(false);
    }
}