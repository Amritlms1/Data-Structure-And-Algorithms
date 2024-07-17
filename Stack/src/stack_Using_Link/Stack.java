package stack_Using_Link;

public class Stack {
	private Node first=null;
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
}

public int size()
{
	return count;
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
public Object pop()
{
	Node curr=first;
	Node prev=null;
	while(curr.next!=null)
	{
		prev=curr;
		curr=curr.next;
	}
	prev.next=null;
	count--;
	return curr.ele;
}
public Object peek()
{
	Node curr=first;
	while(curr.next!=null)
	{
		curr=curr.next;
	}
	return curr.ele;
}
}
