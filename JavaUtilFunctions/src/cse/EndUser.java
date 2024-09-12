package cse;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EndUser {

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("A", "B", "C", "D");
        for (String s : ls) {
            printElement(s, str -> System.out.println(str.toLowerCase()));
        }
    }

    private static void printElement(String s, Consumer<String> c) {
        c.accept(s);
    }
}
//Write a java program to have a list of quantities and list of their prices, add some elements into it, 4 quantities of 4 prices . Create a list of integer and list of double values
//Find out what is the total cost of all these products and print the total cost .