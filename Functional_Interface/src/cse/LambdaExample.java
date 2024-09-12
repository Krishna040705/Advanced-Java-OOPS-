package cse;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation addition =(a,b)->a+b;
		MathOperation subtraction =(a,b)->a-b;
		MathOperation multiplication =(a,b)->a*b;
		MathOperation divison =(a,b)->a/b ;
		
		System.out.println("10+5="+addition.operation(10, 5)));
		System.out.println("10-5="+subtraction.operation(10,5));
        System.out.println("10 * 5 = " + multiplication.operation(10, 5));
        System.out.println("10 / 5 = " + division.operation(10, 5));
				

	}

}
