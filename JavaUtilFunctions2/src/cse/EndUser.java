package cse;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class EndUser {

    public static void main(String[] args) {
        Set<Circle> tsc1 = new TreeSet<>((c1, c2) -> c1.getRadius() - c2.getRadius());
        tsc1.add(new Circle(10));
        tsc1.add(new Circle(100));
        tsc1.add(new Circle(1));
        tsc1.add(new Circle(15));
        tsc1.add(new Circle(13));
        tsc1.add(new Circle(15));
        
        Function<Integer, Double> ca = r -> Math.PI * Math.pow(r, 2);
        
        for (Circle c : tsc1) {
            double area = ca.apply(c.getRadius());
            System.out.println(area);
        }
    }
}
//Take an array list of integers and print sum of 2 adjacent numbers from the array list using the Bifunction  ...Pass the lambda expression as an argument


