package com.learning.BST2SkewSoln;

// Class definition for Individual Node in a Tree

class Node{
	
	int val;
	Node left;
	Node right;
	
	Node(int data){
		this.val = data;
		left = null;
		right = null;
	}
}


// Class definition and properties of a BS Tree

public class BSTreeDS {
	
	static Node prev;
	
	// InOrder display of Tree
	public void inOrderDisplay(Node root) {
		
		if(root!=null) {
			inOrderDisplay(root.left);
			System.out.print(root.val + " ");
			inOrderDisplay(root.right);
		}		
	}
		
	// Function to convert BST to Skewed tree
	public Node bstToSkew(Node root) {
		Node temp = new Node(-1);
		
		prev = temp;
		
		skewOrder(root);
		
		prev.left = null;
		prev.right = null;
		return temp.right;
	}
	
	// Skewed tree conversion - Main function
	public void skewOrder(Node curr) {
		
		if(curr == null) {
			return;
		}		
		skewOrder(curr.left);
		prev.left = null;
		prev.right = curr;
		prev = curr;
		skewOrder(curr.right);		
	}
}
