package arrayPrograms.SeachAlgo;

public class BinarySearchForAscendingRecursion {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int target=4;
		int index=binarySearchForAscendingRecursion(arr,0,arr.length-1,target);
		System.out.println("The index of  "+target+" ="+index);

	}

	private static int binarySearchForAscendingRecursion(int[] arr, int first, int last, int target) {
		if(first<=last)
		{
			int mid=(first+last)/2;
			if(target<arr[mid])return binarySearchForAscendingRecursion(arr,first,mid-1,target);
			else if(target>arr[mid])return binarySearchForAscendingRecursion(arr,mid+1,last,target);
			else if(target==arr[mid])return mid;
			
		}
		
		return -1;
	}

}
