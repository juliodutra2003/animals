package net.crazyminds.animals.view;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViewTest {

	
	@Test
	public final void ValidateAnswerForRightSInput() 
	{
		assertTrue(View.ValidateAnswer("s"));
	}

	@Test
	public final void ValidateAnswerForRightNInput() 
	{
		assertTrue(View.ValidateAnswer("n"));
	}
	
	@Test
	public final void ValidateAnswerForWrongInput() 
	{
		assertFalse(View.ValidateAnswer("y"));
	}
}
