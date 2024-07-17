package arrayPrograms.Matrix;

public class MultiplicationOf2Matrix_3X3 {
public static void main(String[] ar)
{
	int x[][]= {{1,1,1},
				{1,1,1},
				{1,1,1}};
	int y[][]= {{1,1,1},
				{1,1,1},
				{1,1,1}};
	int multi[][]=multiplication(x,y);
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			System.out.print(multi[i][j]+"\t");
		}
		System.out.println();
	}
}

private static int[][] multiplication(int[][] x, int[][] y) {
	int [][]multi=new int[x.length][y.length];
	for(int k=0;k<x.length;k++)
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				multi[k][i]+=x[k][j]*y[j][k];
			}
		}
	}
	return multi;
}
}
