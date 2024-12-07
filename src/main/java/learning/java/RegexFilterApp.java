package learning.java;

import java.util.List;

public class RegexFilterApp {
    public static void main(String[] args) {
        Input input = new Input();
        RegexFilter filter = new RegexFilter();
        Output output = new Output();

        List<String> inputStrings = input.getStrings();
        String regex = input.getRegex();

        List<String> filteredStrings = filter.filterStrings(inputStrings, regex);
        output.displayFilteredStrings(filteredStrings);
    }
}
