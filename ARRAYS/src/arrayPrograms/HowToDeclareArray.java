package arrayPrograms;

public class HowToDeclareArray {
public static void main(String []ar)
{
	int x[]=new int[6];
	x[0]=1;
	x[1]=2;
	x[2]=1;
	x[3]=2;
	x[4]=1;
	x[5]=2;
	int[] y= {1,2,3,7,6,5,8};
	for(int n:x)
	{
		System.out.print(n+" ");
	}
	System.out.println();
	for(int n:y)
	{
		System.out.print(n+" ");
	}
	
}
}
