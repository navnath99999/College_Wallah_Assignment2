package Assignment2;

import java.util.Scanner;

public class question4 
{

	public static void main(String[] args) 
	{
	   Scanner s = new Scanner(System.in) ;
	   
	   System.out.println("Enter number of test cases");
	   int t = s.nextInt() ;
	   
	   for(int i=1;i<=t;i++)
	   {
		   System.out.println("First integer to be added");
		   int a = s.nextInt() ;
		   System.out.println("Second integer to be added");
		   int b = s.nextInt() ;
		   
		   System.out.println("After Adding two integers: "+ (a+b));
	   }
	   
	   
	}

}
