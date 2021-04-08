import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTranslateTest {

    @Test
    void translate() {
        int value = 41;
        String expected = "41";
        String expectedResult = "41";
        String result = FizzBuzzTranslate.translate(value);
        assertEquals(expected, result);
        String result2 = FizzBuzzTranslate.findNumber(value);
        assertEquals(expectedResult, result2);
    }

    @Test
    void anslate() {
        int value = 50;
        String expected = "Buzz";
        String expectedResult = "Buzz";
        String result = FizzBuzzTranslate.translate(value);
        assertEquals(expected, result);
        String result2 = FizzBuzzTranslate.findNumber(value);
        assertEquals(expectedResult, result2);
    }

    @Test
    void transla() {
        int value = 93;
        String expected = "Fizz";
        String expectedResult = "Fizz";
        String result = FizzBuzzTranslate.translate(value);
        assertEquals(expected, result);
        String result2 = FizzBuzzTranslate.findNumber(value);
        assertEquals(expectedResult, result2);
    }

    @Test
    void tralate() {
        int value = 60;
        String expected = "FizzBuzz";
        String expectedResult = "60";
        String result = FizzBuzzTranslate.translate(value);
        assertEquals(expected, result);
        String result2 = FizzBuzzTranslate.findNumber(value);
        assertEquals(expectedResult, result2);
    }
}