package arrayPrograms.SeachAlgo;

public class BinarySearchForAscending {
public static void main(String args[])
{
int[] arr= {1,2,3,4,5,6,7,8,9};
int target =8;
int index=binarySearchAsc(arr,target);
System.out.println("The index of  "+target+" ="+index);
}

private static int binarySearchAsc(int[] arr, int target) {
	int first=0,last=arr.length-1;
	while(first<=last)
	{
		int mid=(first+last)/2;
		if(target<arr[mid])last=mid-1;
		else if(target>arr[mid])first=mid+1;
		else if(target==arr[mid])return mid;
	}
	return -1;
}
}
