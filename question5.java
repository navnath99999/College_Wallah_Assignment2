package Assignment2;

import java.util.Scanner;

public class question5 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in) ;
		
		while(s.hasNextLine())
		{
			
			String a = s.next() ;
			String b = s.next() ;
			System.out.println("After concatinating two strings");
			System.out.println(a+b);
		}

	}

}
