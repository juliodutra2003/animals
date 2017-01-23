package net.crazyminds.animals.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class View {
	
	static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in, Charset.defaultCharset()));	
	
	private static final String startMessageHelper =  " (pressione enter para começar)" ;
	private static final String yesOrNotMessageHelper =  " (use (s) para SIM, (n) para NÃO)" ;
	private static final String getStringMessageHelper =  " (após escolher pressione enter)" ;
	
	public static void ShowOpenning() 
	{
		System.out.println("Welcome to the Game - v0.1 SNAPSHOT");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Author: Julio Dutra");
		System.out.println("juliodutra2003@yahoo.com.br");
		System.out.println("----------------------------------------------------------------------");		
	}

	public static boolean ShowQuestion(String question)
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

	private static boolean ValidateAnswer(String input) 
	{		
		if(input.equals("n") || input.equals("s"))
		{
			return true;
		}
		System.out.println(input + " não é uma resposta válida. " + yesOrNotMessageHelper);
		return false;
	}

	public static void ShowStartGameMessage(String message) 
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
	
	public static void ShowMessage(String message) 
	{
		System.out.println(message);
	}

	public static String ShowGetString(String question) 
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
