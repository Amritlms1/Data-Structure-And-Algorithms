package practice;

public class InsertionSort {
public static void main(String ar[])
{
	int arr[]= {10,9,3,4,8,1,7};
	arr=sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}

private static int[] sort(int[] arr) {
	for(int i=1;i<arr.length;i++)
	{
		int j=i-1;
		int key=arr[i];
		while(j>-1 && key<arr[j])
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}
		return arr;
	
}
}
