package arrayPrograms.BubbleSort;

public class BubbleSort {
public static void main(String ar[])
{
	int a[]= {3,2,5,4,9,6};
	sort(a);
	System.out.println("After Sorting values");
	for(int n:a)
	{
		System.out.print("  "+n);
	}
}
static void sort(int a[])
{
	for(int i=0;i<a.length-1;i++)
	{
		int temp;
		for(int j=0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
}
