package arrayPrograms.SelectionSort;

public class SelectionSort {
public static void main (String ar[])
{
	int a[]= {9,7,5,4,6,3};
	sort(a);
	System.out.println("After Sorting values");
	for(int n:a)
	{
		System.out.print("  "+n);
	}
}
static void sort(int[] a)
{
	for(int i=0;i<a.length-1;i++)
	{
		int index=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[index])index=j;
		}
		if(i!=index)
		{
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
	}
}
}
