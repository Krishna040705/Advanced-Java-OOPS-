package cse;

import java.util.function.BinaryOperator;

public class EndUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printResult(10,20 ,(x,y)->x+y); //Lambda Expression  No need of the class and the method separately
		printResult(10,20 ,(a,b)->a*b); //Lambda Expression
		
		//

	}

	private static void printResult(int a, int b, BinaryOperator<Integer> ia) {
		// TODO Auto-generated method stub
		System.out.println(ia.apply(a, b));
		
	}

}

//There are codes which are big and these codes require more the one interface so lambda expression is only for small code as these only work for functional interfaces
//Java.util.function pkg to be checked