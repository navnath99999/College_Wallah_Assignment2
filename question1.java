package Assignment2;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in) ;
		
		System.out.println("Enter your name");
		String name = s.next() ;
		
		System.out.println("Enter your Roll Number");
		int rollno = s.nextInt() ;
		
		System.out.println("Enter your field of interest");
		String interest = s.next() ;
		
		System.out.println("Name:"+name +","+"Roll number:"+rollno+","+"Field of interest:"+interest);
		

	}

}
