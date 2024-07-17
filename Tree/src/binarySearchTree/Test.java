package binarySearchTree;

public class Test {
public static void main(String ar[])
{
	BinarySearchTree t=new BinarySearchTree();
	t.add(10);
	t.add(5);
	t.add(20);
	t.add(4);
	t.add(7);
	t.add(18);
	t.add(25);
	t.inOrder();
	t.postOrder();
	t.preOrder();
	t.levelOrder();
}
}
