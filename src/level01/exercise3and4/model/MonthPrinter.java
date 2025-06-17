package level01.exercise3and4.model;

import java.util.Arrays;
import java.util.List;

public class MonthPrinter {
    private static final List<String> months = Arrays.asList(
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    );

    public static void printWithLambda() {
        months.forEach(month -> System.out.println(month));
    }

    public static void printWithMethodReference() {
        months.forEach(System.out::println);
    }
}
