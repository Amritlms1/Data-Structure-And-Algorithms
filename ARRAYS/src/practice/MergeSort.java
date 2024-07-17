package practice;

public class MergeSort {
public static void main(String ar[])
{
	int arr[]= {10,9,3,4,8,1,7};
	sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}

private static void sort(int[] arr) {
	if(arr.length==1)return;
	int[] left=new int[arr.length/2];
	int[] right=new int[arr.length-left.length];
	for(int i=0;i<left.length;i++)
	{
		left[i]=arr[i];
	}
	for(int i=0;i<right.length;i++)
	{
		right[i]=arr[i+left.length];
	}
	sort(left);
	sort(right);
	merge(arr,left,right);
}

private static void merge(int[] arr, int[] left, int[] right) {
	int i=0,j=0,k=0;
	while(i<left.length && j<right.length)
	{
		if(left[i]<right[j])
		{
			arr[k]=left[i];
			i++;k++;
		}
		else if(left[i]>right[j])
		{
			arr[k]=right[j];
			k++;
			j++;
		}
	}
	while(i<left.length)
	{
		arr[k]=left[i];
		k++;
		i++;
	}
	while(j<right.length)
	{
		arr[k]=right[j];
		k++;
		j++;
	}
	
}
}
