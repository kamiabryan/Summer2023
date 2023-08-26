//Write a program that asks the user an item's wholesale cost and mark-up percentage. 
//It should display the item's retail price.
//
//The user can keep entering information until they enter the word "stop".
//Error messages should be displayed if the person doesn't enter a correct value like a letter instead of a number.

import java.util.InputMismatchException;
import java.util.Scanner;

public class retailPriceCalculator {
	
	/*
	 * this method will return the final retail value based on the user's wholesale price and markup percentage. 
	 * it stores the final value in variable retailValue.
	*/
	public static double calculateRetail (double wholeSaleCost, double markUpPercent) {
		double retailValue = markUpPercent / 100 + 1;
		
		retailValue = retailValue * wholeSaleCost;
		
		return retailValue;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double wholesaleCost = 0.0;
		double markupPercent = 0.0;
		String exitVariableInput = "";
		
		System.out.println("-------------");
		
		/*
		 * i chose to do a try-catch block because it a simple way to catch incorrect input. 
		 * the user will input the item's wholesale cost, then the mark up percentage. 
		 * the method calculateRetail is called to output the final price to 2 decimal places. 
		 * the user is then prompted to continue or stop the program.
		 *
		 * i used a while loop because the program needs to continue running until the user inputs stop.
		 * the first part of the code is tried again prompting the user to enter the wholesale cost and mark up percentage.
		 * the catch statement will catch any input that is not of double type and output an error message.
		 * the program ends with a good bye statement.
		*/
		
		try {
			System.out.print("Enter your item's wholesale cost $");
			wholesaleCost = sc.nextDouble();
			
			
			System.out.print("Enter your item's mark-up percentage: ");
			markupPercent = sc.nextDouble();
			
			System.out.print("The retail price is $ ");
			System.out.printf("%.2f\n", calculateRetail(wholesaleCost, markupPercent));
		
			System.out.println("-------------");
			System.out.print("Exit program? Enter Stop for yes or anything else for No: ");
			exitVariableInput = sc.next();
			
			while (!(exitVariableInput.equals("stop")) && !(exitVariableInput.equals("Stop")) && !(exitVariableInput.equals("STOP")) ) {
				System.out.println("-------------");
				System.out.print("Enter your item's wholesale cost $");
				wholesaleCost = sc.nextDouble();
				
				System.out.print("Enter your item's mark-up percentage: ");
				markupPercent = sc.nextDouble();
				
				System.out.print("The retail price is $ ");
				System.out.printf("%.2f\n", calculateRetail(wholesaleCost, markupPercent));
				
				System.out.println("-------------");
				System.out.print("Exit program? Enter stop for Yes or anything else for No: ");
				exitVariableInput = sc.next();
			}
			System.out.println("Goodbye");
			
		} 
		catch (InputMismatchException e) {
			System.out.println("Try again! Please enter a valid number.");
		}
		
		
		
	}

}
