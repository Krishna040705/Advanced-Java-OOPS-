package cse;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        fruits.add(1, "Date");
        System.out.println("All  Fruits ArrayList: " +  fruits);

        ArrayList<String> moreFruits = new ArrayList<>(10);
        moreFruits.add("Elderberry");
        moreFruits.add("Fig");
        moreFruits.add("Grapes");
        System.out.println("All  moreFruits ArrayList: " +  moreFruits);

        ArrayList<String> allFruits = new ArrayList<>(fruits);
        allFruits.addAll(moreFruits);

        System.out.println(" Fruits ArrayList: " + fruits);
        System.out.println("All Fruits ArrayList: " + allFruits);
        System.out.println("Size of the ArrayList: " + allFruits.size());
        System.out.println("Element at index 2: " + allFruits.get(2));

        allFruits.set(2, "Citrus");
        System.out.println("Modified ArrayList: " + allFruits);

        Collections.shuffle(allFruits);
        System.out.println("Shuffled ArrayList: " + allFruits);

        System.out.println("Contains 'Banana': " + allFruits.contains("Banana"));

        ArrayList<String> checkFruits = new ArrayList<>(Arrays.asList("Apple", "Fig"));
        System.out.println("Contains all elements of checkFruits: " + allFruits.containsAll(checkFruits));

        System.out.println("Is the ArrayList empty? " + allFruits.isEmpty());

        Object[] fruitsArray = allFruits.toArray();
        System.out.println("Array representation: " + Arrays.toString(fruitsArray));

        System.out.println("ArrayList as List: " + Arrays.asList(fruitsArray));

        allFruits.remove(1); // Removes "Date"
        System.out.println("After removing element at index 1: " + allFruits);

        allFruits.remove("Citrus");
        System.out.println("After removing 'Citrus': " + allFruits);

        ArrayList<String> removeFruits = new ArrayList<>(Arrays.asList("Elderberry", "Fig"));
        allFruits.removeAll(removeFruits);
        System.out.println("After removing elements in removeFruits: " + allFruits);

        Iterator<String> iterator = allFruits.iterator();
        System.out.print("Iterating over ArrayList: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

