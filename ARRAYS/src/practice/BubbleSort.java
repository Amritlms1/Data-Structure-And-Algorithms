package practice;

public class BubbleSort {
public static void main(String ar[])
{
	int [] arr= {9,7,5,2,3,1};
	arr=sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}

private static int[] sort(int[] arr) {
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	return arr;
}
}