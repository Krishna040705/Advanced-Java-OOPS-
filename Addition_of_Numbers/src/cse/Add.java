package cse;

import java.util.Scanner; 


//Addition of 2 Numbers :
public class Add {
  public static void main(String[] args) {
    int krishna, sreenivas,keerti, sum;
    
    Scanner k = new Scanner(System.in); 
    System.out.println("Type 1st number:");
    krishna = k.nextInt(); 
    
    System.out.println("Type 2nd number:");
    sreenivas = k.nextInt(); 
    
    System.out.println("Type 3rd number:");
    keerti=k.nextInt();
    
    
    sum = krishna + sreenivas+keerti;  
    System.out.println("Sum is: " + sum);
  }
}



