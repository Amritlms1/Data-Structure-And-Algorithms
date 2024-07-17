package arrayPrograms.Pattern;

public class PatternFrom_1To20_4Column_5Rows {
public static void main(String ar[])
{
	int arr[][]=new int[5][4];
	arr=addpattern(arr);
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	
}

private static int[][] addpattern(int[][] arr) {
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(j%2==0)
			{
				int x=(j*5)+(i+1);
				arr[i][j]=x;
			}
			else
			{
				int x=5*(j+1)-i;
				arr[i][j]=x;
			}
		}
	}
	return arr;
}
}
