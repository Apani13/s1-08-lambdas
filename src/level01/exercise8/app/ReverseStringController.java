package level01.exercise8.app;

import level01.exercise8.model.StringReverser;

public class ReverseStringController {
    public void run() {
        StringReverser reverser = s -> new StringBuilder(s).reverse().toString();
        String input = "Si ayer fuera hoy, mañana sería de aquí dos días...";
        String output = reverser.reverse(input);
        System.out.printf("Original: %s | Reversed: %s%n", input, output);
    }
}
