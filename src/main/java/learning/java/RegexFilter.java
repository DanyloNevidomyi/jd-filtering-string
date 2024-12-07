package learning.java;

import java.util.ArrayList;
import java.util.List;

public class RegexFilter {
    public List<String> filterStrings(List<String> inputStrings, String regex) {
        List<String> filteredStrings = new ArrayList<>();
        for (String str : inputStrings) {
            if (str.matches(regex)) {
                filteredStrings.add(str);
            }
        }
        return filteredStrings;
    }
}
