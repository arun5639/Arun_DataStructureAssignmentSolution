package com.learning.BST2SkewSoln;

public class BSTDriver {
	
	public static void main(String[] args) {
		
		Node tree = new Node(50);
		tree.left = new Node(30);		
		tree.right = new Node(60);
		tree.left.left = new Node(10);
		tree.right.left = new Node(55);
		
		// Original Binary Search Tree
		System.out.println("In Order traversal of Binary Search Tree ->");
		new BSTreeDS().inOrderDisplay(tree);
		
		Node temp = new BSTreeDS().bstToSkew(tree);
		
		// Skewed Tree
		System.out.println("\nSkewed Tree ->");
		new BSTreeDS().inOrderDisplay(temp);	
	}	
}
