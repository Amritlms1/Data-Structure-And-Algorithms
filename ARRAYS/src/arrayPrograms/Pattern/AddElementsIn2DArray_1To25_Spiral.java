package arrayPrograms.Pattern;

public class AddElementsIn2DArray_1To25_Spiral {
public static void main(String []ar)
{
	int x[][]=new int[5][5];
	x=addElement(x,0,0);
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			System.out.print(x[i][j]+"\t");
		}
		System.out.println();
	}
}

private static int[][] addElement(int[][] x,int row,int column) {
	
	int[][] y=new int [x.length][x.length];
	char direction='r';
	for(int i=1;i<=x.length*x.length;i++)
	{
		switch(direction)
		{
				case 'r':
				{
					y[row][column]=i;
					column++;
					if(column==x.length-1-row)direction='d';
					break;
				}
				case 'd':
				{
					y[row][column]=i;
					row++;
					if(column==row)direction='l';
					break;
				}
				case 'l':
				{
					y[row][column]=i;
					column--;
					if(column==x.length-1-row)direction='u';
					break;
				}
				case 'u':
				{
					y[row][column]=i;
					row--;
					if(row==column+1)direction='r';
					break;
				}
		}
	}
	return y;
}
}
