package controller;

import java.util.Scanner;

public class Controller
{
	public void start()
	{
		validInt();
		//funThing();
		//moreInput();
	}
	private void questions()
	{
		//System.out.println("whats new scooby doo?");
	}
	private void moreInput()
	{
		Scanner anotherInputScanner;
		
		anotherInputScanner = new Scanner(System.in);
		
		System.out.println("What is the meaning of life, the universe and everything?");
		int answer = anotherInputScanner.nextInt();
		
		System.out.println("You typed: " + answer); //the plus sign smushes them together
		anotherInputScanner.nextLine(); //used to consume the enter key press
		
		anotherInputScanner.close(); //closes keyboard input for security
		
		//double holds real numbers aka numbers w/ a decimal point
		
		//double magicNumber;
		
		//magicNumber = anotherInputScanner.nextDouble(); 
				
		//System.out.println("type your favorite fractional number w a decimal");
		//magicNumber = anotherInputScanner.nextDouble();
		
		//System.out.println(magicNumber + " is a superb number");
		
	}
	private void funThing()

	{
		Scanner funScanner;
		
		funScanner = new Scanner(System.in);
		
		System.out.println("rate your day from 1-10!");
		int answer = funScanner.nextInt();
		
		System.out.println("your day:" + answer);
		funScanner.nextLine();
		
		//if (dayScore = 1)
				//System.out.println("have a better day please");
		funScanner.close();
	}
	
	public boolean validInt(String example)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Type in a valed int value, human!");
		}
		
		return isValid;
	}

	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only floating point values are allowed for input");
		}
		
		return isValid;
	}
