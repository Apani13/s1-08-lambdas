package level01.exercise6and7.app;

import level01.exercise6and7.model.StringSorter;

import java.util.Arrays;
import java.util.List;

public class StringSorterController {
    public void run() {
        List<String> items = Arrays.asList(
                "Castañuelas", "Castaña", "Castellano", "Casto",
                "Castidad", "Castillo");

        System.out.println("Sorted shortest to longest:");
        StringSorter.sortShortestToLongest(items)
                .forEach(System.out::println);

        System.out.println("\nSorted longest to shortest:");
        StringSorter.sortLongestToShortest(items)
                .forEach(System.out::println);
    }

}
