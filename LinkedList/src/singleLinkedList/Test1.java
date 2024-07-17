package singleLinkedList;

public class Test1 {
public static void main(String ar[])
{
	LinkedList l=new LinkedList();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.remove(3);
	l.add(0,23);
	l.add(2,24);
	System.out.println("The elements in Linked List ="+l.size()+"\n");
	for(int i=0;i<l.size();i++)
	{
		System.out.print(l.get(i)+" ");
	}
	System.out.println();
	l.reverse();
	for(int i=0;i<l.size();i++)
	{
		System.out.print(l.get(i)+" ");
	}
}
}
