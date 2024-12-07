package learning.java;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class OutputTest {
    @Test
    void testDisplayFilteredStrings_WithResults() {
        Output output = new Output();
        List<String> filteredStrings = Arrays.asList("apple", "apricot");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        output.displayFilteredStrings(filteredStrings);

        String expectedOutput = "Відфільтровані рядки:\napple\napricot\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayFilteredStrings_NoResults() {
        Output output = new Output();
        List<String> filteredStrings = Arrays.asList();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        output.displayFilteredStrings(filteredStrings);

        String expectedOutput = "Жоден рядок не відповідає регулярному виразу.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}