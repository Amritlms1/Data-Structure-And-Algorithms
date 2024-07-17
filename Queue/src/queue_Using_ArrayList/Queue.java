package queue_Using_ArrayList;

import java.util.EmptyStackException;

public class Queue {
private int count=0;
private Object[] arr=new Object[10];
public void push(Object ele)
{
	if(count>=arr.length)increase();
	arr[count++]=ele;
}
public Object poll()
{
	if(isEmpty())throw new EmptyStackException();
	Object temp=arr[0];
	for(int i=0;i<count;i++)
	{
		arr[i]=arr[i+1];
	}
	count--;
	return temp;
}
public Object peek()
{
	return arr[0];
}
public int size()
{
	return count;
}
public void increase()
{
	Object temp[]=new Object[arr.length+arr.length/2];
	for(int i=0;i<temp.length;i++)
	{
		temp[i]=arr[i];
	}
	arr=temp;
}
public boolean isEmpty()
{
	return size()==0;
}
}
