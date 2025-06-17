package level01.exercise3and4.app;

import level01.exercise3and4.model.MonthPrinter;

public class MonthPrinterController {
    public void run() {
        System.out.println("PRINT WITH LAMBDA:");
        MonthPrinter.printWithLambda();

        System.out.println("\nPRINT WITH METHOD REFERENCE:");
        MonthPrinter.printWithMethodReference();
    }
}
