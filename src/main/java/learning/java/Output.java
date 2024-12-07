package learning.java;

import java.util.List;

public class Output {

    public void displayFilteredStrings(List<String> filteredStrings) {
        if (filteredStrings.isEmpty()) {
            System.out.println("Жоден рядок не відповідає регулярному виразу.");
        } else {
            System.out.println("Відфільтровані рядки:");
            for (String str : filteredStrings) {
                System.out.println(str);
            }
        }
    }
}
