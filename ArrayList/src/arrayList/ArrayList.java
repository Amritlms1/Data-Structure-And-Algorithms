package arrayList;

public class ArrayList {
	private static int count=0;
	Object[] arr=new Object[10];
public void add(Object ele)
{
	if(count>=arr.length)increase();
	arr[count]=ele;
	count++;
}

public Object get(int index)
{
	return arr[index];
	
}

public int size()
{
	return count;
}


private void increase() {
Object[] temp=new Object[arr.length+(arr.length)/2];
for(int i=0;i<arr.length;i++)
{
	temp[i]=arr[i];
}
arr=temp;	
}

public void add(int index,Object ele)
{
	if(index<=-1 || index>=size())
	throw new IndexOutOfBoundsException();
	for(int i=size();i>index;i--)
	{
		arr[i]=arr[i-1];
	}
	arr[index]=ele;
	count++;
}
}
