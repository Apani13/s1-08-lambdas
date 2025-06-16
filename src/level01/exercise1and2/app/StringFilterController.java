package level01.exercise1and2.app;

import level01.exercise1and2.model.StringFilter;

import java.util.Arrays;
import java.util.List;

public class StringFilterController {

    public void run() {
        List<String> words = Arrays.asList("Orondono", "Astucia", "Golondrina", "Sillita", "Cripta", "Ciprés");

        System.out.println("Strings containing 'o");
        StringFilter.filterContainingO(words).forEach(System.out::println);

        System.out.println("\nStrings containing 'o' and longer than 5 characters:");
        StringFilter.filterContainingOAndLength(words).forEach(System.out::println);
    }

}
