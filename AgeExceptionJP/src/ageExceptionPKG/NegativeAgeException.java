package ageExceptionPKG;               // Declared a package

// This class is used to define an user defined exception

public class NegativeAgeException extends Exception{           // Declared a class which extends Exception class
	
	NegativeAgeException(String string)                    // Using parameterized constructor  
	{
		super(string);                                     // using super to call exception class constructor
	}

}