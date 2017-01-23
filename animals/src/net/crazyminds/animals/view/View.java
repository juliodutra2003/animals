package net.crazyminds.animals.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class View {
	
	static BufferedReader consoleReader;	
	
	private static final String startMessageHelper =  " (pressione enter para começar)" ;
	private static final String yesOrNotMessageHelper =  " (use (s) para SIM, (n) para NÃO)" ;
	private static final String getStringMessageHelper =  " (após escolher pressione enter)" ;
	
	private static View instance;
	
	//synchronized - not allow more then one instance, by method being called by two different threads.
	public static synchronized View getInstance()
	{
		if(instance == null)
			instance = new View();
		return instance;
	}
	
	View()
	{
		consoleReader = new BufferedReader(new InputStreamReader(System.in, Charset.defaultCharset()));
	}
	
	/**
	 * Show the entering message of the game
	 */
	public void ShowOpenning() 
	{
		System.out.println("Welcome to the Game - v0.1 SNAPSHOT");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Author: Julio Dutra");
		System.out.println("juliodutra2003@yahoo.com.br");
		System.out.println("----------------------------------------------------------------------");		
	}
	
	
	/**
	 * Show a parameterized question in the prompt command line, and read the answer. 
	 * Only answers 's' or 'n''will be accepted.
	 * Will stop and wait for the 'enter' command
	 *
	 * @param question is the message to be printed
	 */
	public boolean ShowQuestion(String question)
	{
		System.out.println(question +"? " + yesOrNotMessageHelper);
		String input = "";
		try 
		{
			input = consoleReader.readLine();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		if (!ValidateAnswer(input))
		{
			ShowQuestion(question);	
		}
		
		if(input.equals("n"))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	/**
	 * Validate the string input.
	 *
	 * @param input is a string
	 * 
	 * @return true if the input is equals to 'n' or 's'. Returns false if any other characters are passed as input.
	 */
	public boolean ValidateAnswer(String input) 
	{		
		if(input.equals("n") || input.equals("s"))
		{
			return true;
		}
		System.out.println(input + " não é uma resposta válida. " + yesOrNotMessageHelper);
		return false;
	}

	/**
	 * Show Start Game Message and waits until user press 'enter'.
	 *
	 * @param message is the message to be printed
	 * 
	 */
	public void ShowStartGameMessage(String message) 
	{
		System.out.println(message + startMessageHelper);
		try 
		{
			consoleReader.readLine();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Show a generic message to be printed in the console
	 *
	 * @param message is a message to print
	 * 
	 */
	public void ShowMessage(String message) 
	{
		System.out.println(message);
	}

	
	/**
	 * Asks for a string to be inserted from user. Waits until user press 'enter'.
	 *
	 * @param question is a enlightening message to the user
	 * 
	 * @return a string with the value inserted by the user
	 */
	public String ShowGetString(String question) 
	{
		System.out.println(question + getStringMessageHelper);
		
		String input = "";
		try 
		{
			input = consoleReader.readLine();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return input;
	}
	

}
