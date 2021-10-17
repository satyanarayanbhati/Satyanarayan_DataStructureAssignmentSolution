package com.greatlearning.question2.services;

import com.greatlearning.question2.model.Node;

public class TransactionService {

	 public static Node prevNode = null;
	    public static Node headNode = null;

	 	    public void convertBTToRightSkewed(Node root) {

	        if (root == null) {
	            return;
	        }

	        convertBTToRightSkewed(root.getLeft());

	        Node rightNode = root.getRight();

	        if (headNode == null) {
	            headNode = root;
	            root.setLeft(null);
	            prevNode = root;
	        } else {
	            prevNode.setRight(root);
	            root.setLeft(null);
	            prevNode = root;
	        }

	  
	        convertBTToRightSkewed(rightNode);

	    }

	
	    public void traverseRightSkewed(Node root) {
	        if (root == null) {
	            return;
	        }
	        System.out.print(root.getData() + " ");
	        traverseRightSkewed(root.getRight());
	    }

}
