package level01.exercise5.app;

import level01.exercise5.model.PiSupplier;

public class PiAppController {
    public void run() {
        PiSupplier pi = () -> 3.1415;
        System.out.printf("Pi value: %.4f%n", pi.getPiValue());
    }
}
