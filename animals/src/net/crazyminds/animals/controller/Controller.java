package net.crazyminds.animals.controller;

import net.crazyminds.animals.model.Node;
import net.crazyminds.animals.model.Tree;
import net.crazyminds.animals.view.View;

public class Controller {

	Node tree;

	public Controller()
	{
		tree = new Node("vive na água");
		tree.setYes(new Node("é Tubarao"));
		tree.setNo(new Node("é Macaco"));
		
		
		View.getInstance().ShowOpenning();
		
		int endGame = 1;

		while (endGame == 1) 
		{		
			
			View.getInstance().ShowStartGameMessage("Pense em um animal" );
			
			boolean answerCharacteristic  = View.getInstance().ShowQuestion("O animal que você pensou " + tree.getCharacteristic() );
			
			if (answerCharacteristic)
			{
				AskPlayer(tree.getYes());
			}
			else
			{
				AskPlayer(tree.getNo());
			}
		}
	}
	
	
	/**
	 * Recursive method - search for a specific node.
	 * 
	 * @param node is the start node for the searching.
	 */
	private void AskPlayer(Node node) 
	{		
		boolean answerCharacteristic  = View.getInstance().ShowQuestion("O animal que você pensou " + node.getCharacteristic() );
		
		if (answerCharacteristic)
		{
			if ( node.getYes() == null )
			{
				View.getInstance().ShowMessage( "Acertei de novo!");
			}
			else
			{
				AskPlayer(node.getYes());
			}
		}
		else
		{
			if ( node.getNo() == null )
			{
				String name  = View.getInstance().ShowGetString("Qual o animal que você pensou?");

				String characteristic = View.getInstance().ShowGetString("Um(a) " + name + "______ mas um(a) "+ node.getCharacteristic() +" não.");
				
				Tree.AddNewAnimal(node, name, characteristic);
			}
			else
			{
				AskPlayer(node.getNo());
			}
		}
	}
}
