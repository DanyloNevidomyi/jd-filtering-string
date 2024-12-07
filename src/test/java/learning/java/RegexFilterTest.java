package learning.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RegexFilterTest {
    @Test
    void testFilterStrings_MatchesFound() {
        RegexFilter filter = new RegexFilter();
        List<String> inputStrings = Arrays.asList("apple", "banana", "apricot", "cherry");
        String regex = "^a.*";

        List<String> result = filter.filterStrings(inputStrings, regex);

        assertEquals(Arrays.asList("apple", "apricot"), result);
    }

    @Test
    void testFilterStrings_NoMatches() {
        RegexFilter filter = new RegexFilter();
        List<String> inputStrings = Arrays.asList("banana", "cherry", "date");
        String regex = "^a.*";

        List<String> result = filter.filterStrings(inputStrings, regex);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilterStrings_EmptyList() {
        RegexFilter filter = new RegexFilter();
        List<String> inputStrings = Arrays.asList();
        String regex = "^a.*";

        List<String> result = filter.filterStrings(inputStrings, regex);

        assertTrue(result.isEmpty());
    }

}