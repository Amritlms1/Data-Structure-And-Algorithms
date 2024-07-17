package stack_Using_ArrayList;

import java.util.EmptyStackException;

public class Stack {
	private int count=0;
	private Object[] arr=new Object[10];
public void push(Object ele)
{
	if(count>=arr.length)increase();
	arr[count++]=ele;
}
public Object pop()
{
	if(isEmpty())
	{
		throw new EmptyStackException();
	}
	Object e=arr[--count];
	arr[count]=null;
	return e;
}
private void increase()
{
	Object[] temp=new Object[arr.length+arr.length/2];
	for(int i=0;i<temp.length;i++)
	{
		temp[i]=arr[i];
	}
	arr=temp;
}
public Object peek()
{
	return arr[count-1];
}
public int size()
{
	return count;
}
public boolean isEmpty()
{
	return size()==0;
}
}
