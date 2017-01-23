package net.crazyminds.animals.model;

import net.crazyminds.animals.view.View;

public class Tree {
	
	/**
	 * Adds 2 new children nodes  to a node
	 * 
	 * @param node is the one who receives the children nodes.
	 * 
	 *  Obs: está aqui somente para respeitar o design MVC. Perdeu o sentido dada a simplicidade do projeto.
	 */
	public static void AddNewAnimal(Node node)
	{
			String name  = View.ShowGetString("Qual o animal que você pensou?");

			String characteristic = View.ShowGetString("Um(a) " + name + "______ mas um(a) "+ node.getCharacteristic() +" não.");

			
			node.setNo( new Node( node.getCharacteristic()) );	
			node.setYes(new Node("é "+ name) );
			node.setCharacteristic(characteristic);
	}
	

}
