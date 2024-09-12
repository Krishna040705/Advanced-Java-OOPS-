package cse;

@FunctionalInterface
interface INumber {
    int calculate(int a);  // Changed return type to int
}

public class SquareofANumber {
    public static void main(String[] args) {
        INumber square = a -> a * a;  
        System.out.println(square.calculate(20)); 
    }
}
