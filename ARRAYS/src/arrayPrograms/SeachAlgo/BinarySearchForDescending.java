package arrayPrograms.SeachAlgo;

public class BinarySearchForDescending {
public static void main(String[] ar)
{
	int arr[]= {9,8,7,6,5,4,3,2,1};
	int target=10;
	int index=binarySearchDesc(arr,target);
	System.out.println("The index of  "+target+" ="+index);
}

private static int binarySearchDesc(int[] arr, int target) {
	int first=0;
	int last=arr.length-1;
	while(first<=last)
	{
		int mid=(first+last)/2;
		if(target<arr[mid])first=mid+1;
		else if(target>arr[mid])last=mid-1;
		else if(target==arr[mid])return mid;
	}
	return -1;
}
}
