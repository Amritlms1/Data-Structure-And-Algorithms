package arrayPrograms;

public class SumAllElementsInArray {
public static void main(String []ar)
{
	int[] x= {2,2,2,2,2,2};
	int answer=sum(x);
	System.out.print("Sum of all Elements of an Array is ="+answer);
}
public static int sum(int[] x)
{
	int sum=0;
	for(int n:x)
	{
		sum+=n;
	}
	return sum;
}
}
