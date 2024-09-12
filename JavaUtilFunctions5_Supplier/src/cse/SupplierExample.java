package cse;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> messageSupplier = () -> "This is a message from Supplier!";
        printMessage(messageSupplier);
    }

    private static void printMessage(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}
