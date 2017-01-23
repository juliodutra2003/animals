package net.crazyminds.animals.controller;

import net.crazyminds.animals.model.Node;
import net.crazyminds.animals.view.View;

public class Controller {

	Node tree;

	public Controller()
	{
		tree = new Node("vive na água");
		tree.setYes(new Node("é Tubarao"));
		tree.setNo(new Node("é Macaco"));
		
		
		View.ShowOpenning();
		
		int endGame = 1;

		while (endGame == 1) 
		{		
			
			View.ShowStartGameMessage("Pense em um animal" );
			
			boolean answerCharacteristic  = View.ShowQuestion("O animal que você pensou " + tree.getCharacteristic() );
			
			if (answerCharacteristic)
			{
				AskPlayer(tree.getYes());
			}
			else
			{
				AskPlayer(tree.getNo());
			}
			
			//AskPlayer(tree);	
			//endGame = 0;
		}
	}
	
	
	private void AskPlayer(Node node) 
	{		
		boolean answerCharacteristic  = View.ShowQuestion("O animal que você pensou " + node.getCharacteristic() );
		
		if (answerCharacteristic)
		{
			if ( node.getYes() == null )
			{
				View.ShowMessage( "Acertei de novo!");
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
				addNewAnimal(node);
			}
			else
			{
				AskPlayer(node.getNo());
			}
		}
	}
	
	private void addNewAnimal(Node node)
	{
			String name  = View.ShowGetString("Qual o animal que você pensou?");

			String characteristic = View.ShowGetString("Um(a) " + name + "______ mas um(a) "+ node.getCharacteristic() +" não.");

			
			node.setNo( new Node( node.getCharacteristic()) );	
			node.setYes(new Node("é "+ name) );
			node.setCharacteristic(characteristic);
	}

}
