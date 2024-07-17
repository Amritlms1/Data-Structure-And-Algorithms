package arrayPrograms;

public class SmallestNumInArray {
public static void main(String ar[])
{
	int x[]= {3,5,7,2};
	int small=smallest(x);
	System.out.print("Smallest Num in the Array is ="+small);
}

private static int smallest(int[] x) {
	int small=x[0];
	for(int n:x)
	{
		if(n<small)small=n;
	}
	return small;
}
}
