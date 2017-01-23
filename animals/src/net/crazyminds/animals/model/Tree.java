package net.crazyminds.animals.model;

import net.crazyminds.animals.view.View;

public class Tree {
	
	/**
	 * Adds 2 new children nodes  to a node
	 * 
	 * @param node is the one who receives the children nodes.
	 * @param name is the of the new node YES.
	 * @param characteristic is characteristic of the new node YES.
	 * 
	 *  Obs: está aqui somente para respeitar o design MVC. Perdeu o sentido dada a simplicidade do projeto.
	 */
	public static void AddNewAnimal(Node node, String name, String characteristic)
	{			
			node.setNo( new Node( node.getCharacteristic()) );	
			node.setYes(new Node("é "+ name) );
			node.setCharacteristic(characteristic);
	}
}
