package learning.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public List<String> getStrings() {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Введіть рядки (введіть 'STOP', щоб завершити):");
        while (true) {
            String input = scanner.nextLine();
            if ("STOP".equals(input)) {
                break;
            }
            strings.add(input);
        }
        return strings;
    }

    public String getRegex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть регулярний вираз: ");
        return scanner.nextLine();
    }
}
