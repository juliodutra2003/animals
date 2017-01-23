package net.crazyminds.animals.view;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViewTest {

	
	@Test
	public final void ValidateAnswerForRightSInput() 
	{
		assertTrue(View.getInstance().ValidateAnswer("s"));
	}

	@Test
	public final void ValidateAnswerForRightNInput() 
	{
		assertTrue(View.getInstance().ValidateAnswer("n"));
	}
	
	@Test
	public final void ValidateAnswerForWrongInput() 
	{
		assertFalse(View.getInstance().ValidateAnswer("y"));
	}
}
