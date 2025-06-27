package level01.exercise6and7.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringSorterController {
    public void run() {
        List<Object> mixedList = Arrays.asList(
                "Castañuelas", 42 , "Castaña", 666 , "Castellano", 23, "Casto",
                "Castidad", 13, "Castillo");

        System.out.println("Sorted shortest to longest:");
        List<String> sortedStringsShorToLong = mixedList.stream()
                .filter(word -> word instanceof String)
                .map(word -> (String) word)
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println(sortedStringsShorToLong);


        System.out.println("\nSorted longest to shortest:");
        List<String> sortedStringsLongToShort = mixedList.stream()
                .filter(word -> word instanceof String)
                .map(word -> (String) word)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        System.out.println(sortedStringsLongToShort);
    }

}
