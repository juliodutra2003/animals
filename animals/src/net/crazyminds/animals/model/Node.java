package net.crazyminds.animals.model;

import java.util.ArrayList;


/**
 * 
 * @author julio
 *
 * Node represents the node object in the binary search tree
 */

public class Node {
		
	String characteristic; 
	Node yes;
	Node no;
	
	
	public Node(String characteristic)
	{
		this.characteristic = characteristic;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public Node getYes() {
		return yes;
	}

	public void setYes(Node yes) {
		this.yes = yes;
	}

	public Node getNo() {
		return no;
	}

	public void setNo(Node no) {
		this.no = no;
	}
	
	
}
