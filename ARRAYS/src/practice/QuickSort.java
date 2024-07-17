package practice;

public class QuickSort {
	public static void main(String ar[])
	{
		int arr[]= {10,9,3,4,8,1,7};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static void sort(int[] arr,int start,int end) {
	if(start>=end)return;
		int i=start,j=end,pivot=arr[(start+end)/2];
		while(i<=j)
		{
			while(arr[i]<pivot)i++;
			while(arr[j]>pivot)j--;
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			sort(arr,start,j);
			sort(arr,i,end);
		}
	}
}