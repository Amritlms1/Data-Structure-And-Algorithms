package arrayPrograms.MergeSort;

public class InsertionSort {
public static void main(String ar[])
{
	int a[]= {9,5,6,7,3,2,4};
	sort(a);
	System.out.println("After Sorting values");
	for(int n:a)
	{
		System.out.print("  "+n);
	}
}
private static void sort(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		int key=a[i];
		int j=i-1;
		while(j>-1 && a[j]>key)
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
}
}
