package arrayListUnderstand;

import java.util.ArrayList;

public class Array_List {
public static void main(String ar[])
{
	ArrayList<Integer> arr =new ArrayList<Integer>();
	arr.add(10);
	arr.add(20);
	arr.add(30);
	arr.add(40);
	arr.add(50);
	for(int i=0;i<arr.size();i++)
	{
		System.out.print("  "+arr.get(i));
	}
	System.out.println();
	arr.set(1,30);
	arr.remove(2);
	for(int i=0;i<arr.size();i++)
	{
		System.out.print("  "+arr.get(i));
	}
}
}
