package cse;
public class SumOfNaturalNumber4  
{  
static int k(int n)   
{   
int sum = 0;   
for (int i = 1; i <= n; i++)    
sum = sum + i;   
return sum;   
}   
public static void main(String args[])   
{   
int n = 2;

System.out.println("Sum of Natural Numbers is: "+k(n));  
}    
}   