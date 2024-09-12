package cse;
class FactorialExample2{  
	
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  int number=4; 
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  


//----------------------------------------------------------------------------------------------------
//Iterative Stmts
//Iterative statements in Java, also known as loops,
//allow you to execute a block of code repeatedly as long as a certain condition is true. 


//-----------------------------------------------------------------------------------------------------
//for (initialization; condition; update) {           
//    // code to be executed
//}
//

//----------------------------------------------------
//
//while (condition) {
//    // code to be executed
//}
//
//
//-----------------------------------------------------

//do {
//    // code to be executed
//} while (condition);

//------------------------------------------------------



//---------------------------------------------------------------------



//Control Flow Stmts

//Control statements are used to control the order in which statements are executed in a program, 
//and to perform tasks like opening and closing files, switching input streams, and making decisions

//If-Else Statement
//if (condition) {
//    // code to execute if condition is true
//} else {
//    // code to execute if condition is false
//}
//



//
//Else-If Ladder
//if (condition1) {
//    // code for condition1
//} else if (condition2) {
//    // code for condition2
//} else {
//    // code if none of the conditions are true
//}



//
//Ternary Operator
//result = (condition) ? value_if_true : value_if_false;




//switch (variable) {
//case value1:
//  break;
//case value2:
//  break;
//default:
//  // code to be executed if no case matches
//}




