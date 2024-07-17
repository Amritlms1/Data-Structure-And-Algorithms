package queue_Using_LinkedList;

public class Queue {
private	Node first=null;
private int count=0;
public void add(Object ele)
{
	if(first==null)
	{
		first=new Node(ele,null);
		count++;
		return;
	}
	Node curr=first;
	while(curr.next!=null)
	{
		curr=curr.next;
	}
	curr.next=new Node(ele,null);
	count++;
	return;
}
public int size()
{
	return count;
}
public Object pool()
{
	Node curr=first;
	first=first.next;
	count--;
	return curr.ele;
}
public Object get(int index)
{
	if(index<=-1 || index>=size())
	{
		throw new IndexOutOfBoundsException();
	}
	Node curr=first;
	for(int i=1;i<=index;i++)
	{
	curr=curr.next;	
	}
	return curr.ele;
}
public Object peek()
{
	return first.ele;
}
}
