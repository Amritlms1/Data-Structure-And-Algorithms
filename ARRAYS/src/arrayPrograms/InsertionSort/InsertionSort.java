package arrayPrograms.InsertionSort;

public class InsertionSort {
public static void main(String ar[])
{
	int a[]= {3,2,50,4,9,6};
	sort(a);
	System.out.println("After Sorting values");
	for(int n:a)
	{
		System.out.print("  "+n);
	}
}

private static void sort(int[] a) {
	for(int i=1;i<a.length;i++)
	{
		int j=i-1;
		int key=a[i];
		while(j>-1 && a[j]>key)
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
	
}
}
