package javaConditionalStatement;

import java.util.Scanner;

//if statement 

public class Example1 {

	public static void main(String[] args) {

		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		number = scanner.nextInt();
		
		scanner.close();
		
		boolean condition =(number > 0);
		
		System.out.println("Validation status " +condition);
		
		System.out.println("========================");
		
		if(condition)
		{
			System.out.println(number +"   is positive number");
		}
			
	}

}
