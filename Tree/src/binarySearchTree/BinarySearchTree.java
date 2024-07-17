package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	private static int count=0;
	private Node root=null;
	public void add(Object ele)
	{
		root=addNode(root,ele);
		count++;
	}
	private Node addNode(Node root, Object ele) {
		if(root==null)
		{
			root=new Node(ele);
			return root;
		}
		if((Integer)ele<(Integer)root.ele)
		{
			root.left=addNode(root.left,ele);
		}
		if((Integer)ele>(Integer)root.ele)
		{
			root.right=addNode(root.right,ele);
		}
		return root;
	}
	public int size()
	{
		return count;
	}
	public void inOrder()
	{
		inOrder(root);
		System.out.println();
		
	}
	private void inOrder(Node root) {
		if(root==null)return;
		inOrder(root.left);
		System.out.print(root.ele+" ");
		inOrder(root.right);
		
	}
	public void preOrder()
	{
		preOrder(root);
		System.out.println();
		
	}
	private void preOrder(Node root) {
		if(root==null)return;
		System.out.print(root.ele+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	public void postOrder()
	{
		postOrder(root);
		System.out.println();
		
	}
	private void postOrder(Node root) {
		if(root==null)return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.ele+" ");
		
	}
	public void levelOrder()
	{
		Queue<Object> s=new LinkedList<Object>();
		if(root!=null)s.add(root);
		while(!s.isEmpty())
		{
			Node n=(Node)s.poll();
			System.out.print(n.ele+" ");
			if(n.left!=null)s.add(n.left);
			if(n.right!=null)s.add(n.right);
		}
		System.out.println();
	}
	}

