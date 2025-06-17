package level01.exercise6and7.model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

    private StringSorter() {};

    public static List<String> sortShortestToLongest(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
    }

    public static List<String> sortLongestToShortest(List<String> list) {
        return list.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .collect(Collectors.toList());
    }

}
