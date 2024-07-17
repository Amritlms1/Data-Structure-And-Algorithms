package arrayPrograms.SeachAlgo;

public class BinarySearchForDescendingRecursion {

	public static void main(String[] args) {
		int [] arr= {9,8,7,6,5,4,3,2,1};
		int target=3;
		int index=binarySearchForDescendingRecursion(arr,0,arr.length-1,target);
		System.out.println("The index of  "+target+" ="+index);
	}

	private static int binarySearchForDescendingRecursion(int[] arr, int first, int last, int target) {
		if(first<=last)
		{
			int mid=(first+last)/2;
			if(target<arr[mid]) return binarySearchForDescendingRecursion(arr,mid+1,last,target);
			else if(target>arr[mid]) return binarySearchForDescendingRecursion(arr,first,mid-1,target);
			else if(target==arr[mid])return mid;
			
		}
		return -1;
	}
}
