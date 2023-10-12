package simpleTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class PositiveTests {

    @Test
    @DisplayName("Условный позитивный тест")
    void someTest() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Условный позитивный тест1")
    void someTest1() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Условный позитивный тест2")
    void someTest2() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Условный позитивный тест3")
    void someTest3() {
        assertTrue(true);
    }
}