package Assignment2;

import java.util.Scanner;

public class question3
{

	public static void main(String[] args) 
	{
      Scanner s = new Scanner(System.in) ;
      
      System.out.println("Eneter marks for the first subjet");
      int sub1 = s.nextInt() ;
      
      System.out.println("Enetr marks for the second subject");
      int sub2 = s.nextInt() ;
      
      System.out.println("Enter marks for the third subject");
      int sub3 = s.nextInt() ;
      
      int TotalMark = sub1 + sub2 + sub3 ;
    		  
      System.out.println("Total marks :"+ TotalMark);
      
      int percentage = TotalMark / 3 ;
      
      System.out.println("Percentage Marks: "+ percentage);


	}

}
