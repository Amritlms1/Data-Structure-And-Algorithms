package doublyLinkedList;

public class DoublyLinkedList {
private int count=0;
private Node head=null;
public void add(Object e)//add
{
	if(head==null)
	{
		head=new Node(e,null,null);
		count++;
		return;
	}
Node curr=head;
while(curr.next!=null)
{
	curr=curr.next;
}
curr.next=new Node(e,curr,null);
count++;
}
public void add(Object e,int index)//add
{
	if(index<=-1 || index>=size())
	{
		throw new IndexOutOfBoundsException();
	}
	if(index==0)
	{
		head=new Node(e,null,head);
		count++;
	}
	Node curr=head;
	for(int i=1;i<index;i++)
	{
	curr=curr.next;	
	}
	Node prev=curr.next;
	curr.next=new Node(e,curr,prev);
	prev.prev=curr.next;
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
	Node curr=head;
	for(int i=1;i<=index;i++) {
		curr=curr.next;
	}
	return curr.ele;
}
public void remove(int index)
{
	if(index<=-1 || index>=size())
	{
		throw new IndexOutOfBoundsException();
	}
	if(index==0)
	{
		head=head.next;
		count--;
		return;
	}
	Node curr=head;
	for(int i=1;i<index;i++)
	{
		curr=curr.next;
	}
	if(index==size()-1)curr.next=null;
	else
	{
		curr.next=curr.next.next;
		curr.next.prev=curr;	
	}
	count--;
}
}
