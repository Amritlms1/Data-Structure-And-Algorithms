package arrayPrograms.SeachAlgo;

public class LinearSearch {
public static void main(String ar[])
{
	int[] arr= {1,2,3,4,5,6,7,8,9};
	int target=10;
	int index=linearSearch(arr,target);
	System.out.println("The index of  "+target+" ="+index);
}

private static int linearSearch(int[] arr, int target) {
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==target)return i;
	}
	return -1;
}
}
