package practice;

public class SelectionSort {
public static void main(String ar[])
{
	int [] arr= {9,5,7,3,6,10};
	arr=sort(arr);
	for(int j=0;j<arr.length;j++)
	{
		System.out.print(arr[j]+" ");
	}
}

private static int[] sort(int[] arr) {
	for(int i=0;i<arr.length-1;i++)
	{
		int index=i;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]<arr[index])index=j;
		}
		if(index!=i)
		{
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}
	return arr;
	
}
}
