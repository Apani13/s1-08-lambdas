package level01.exercise1and2.model;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<String> filterContainingO(List<String> list) {
        return list.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
    }

    public static List<String> filterContainingOAndLength(List<String> list) {
        return list.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }

}
