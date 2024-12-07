package learning.java;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    @Test
    void testGetStrings() {
        String simulatedInput = "apple\nbanana\nSTOP\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Input input = new Input();
        List<String> strings = input.getStrings();

        assertEquals(List.of("apple", "banana"), strings);
    }

    @Test
    void testGetRegex() {
        String simulatedInput = "^a.*\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Input input = new Input();
        String regex = input.getRegex();

        assertEquals("^a.*", regex);
    }

}