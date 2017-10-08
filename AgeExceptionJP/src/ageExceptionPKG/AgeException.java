package ageExceptionPKG;                    // Declared a package


import java.util.Scanner;

// This class is used to throw the user defined exception and to handle the same

public class AgeException {     

	public static void main(String[] args) {                    // main method
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);                // using Scanner to take the dynamic input
		
		System.out.println("Please Enter Your Age : ");            // printing info
        int age = input.nextInt();               // taking user input
        
        try                                             // using to try to implement exception
        {
        	if (age < 0)                               // checking positive or negative age
        	{
        		throw new NegativeAgeException("Invalid Age! Age can not be Negative.");
        	}
        	else System.out.println("Thank you!");                                          // printing info
        }
        catch(NegativeAgeException ne)                   // using catch to handle the exception
        {
        	System.out.println(ne);                         // printing exception message
        }
        
	}

}
