package arrayPrograms.Matrix;

public class SumOfDiagonalElementOfmatrix_3X3 {
public static void main(String ar[])
{
	int x[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
	int sum=sumOfByTwoLoop(x);
	int sum1=sumOfByoneLoop(x);
	System.out.println("Sum of the Diagonals By 2 LOOP is ="+sum);
	System.out.println("Sum of the Diagonals By 1 Loop is ="+sum1);
	}

private static int sumOfByTwoLoop(int[][] x) {
	int sum=0;
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			if(i==j || i+j==x[i].length-1)
			{
				sum+=x[i][j];
			}
		}
	}
	return sum;
}
private static int sumOfByoneLoop(int[][] x) {
	int sum=0;
	for(int i=0;i<x.length;i++)
	{
		sum+=x[i][i];
		if(x.length%2!=0 && i==x.length/2)continue;
		sum+=x[i][i];
	}
	return sum;
	
}
}