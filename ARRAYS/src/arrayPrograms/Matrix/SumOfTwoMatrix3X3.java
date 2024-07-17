package arrayPrograms.Matrix;

public class SumOfTwoMatrix3X3 {
public static void main(String ar[])
{
	int x[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
	int y[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
	int[][] sum=sumOf(x,y);
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			System.out.print(sum[i][j]+"\t");
		}
		System.out.println();
	}
	}

private static int[][] sumOf(int[][] x, int[][] y) {
	int sum[][]=new int[x.length][y.length];
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			sum[i][j]=x[i][j]+y[i][j];
		}
	}
	return sum;
}
}

