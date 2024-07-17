package arrayPrograms.Matrix;

public class TransposeOfAMatrix {
public static void main(String ar[])
{
	int arr[][]= {{1,2,3},
				  {4,5,6},
				  {7,8,9}};
	int[][] transpose=makeTranspose(arr);
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("The Transpose matrix is\n");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(transpose[i][j]+"\t");
		}
		System.out.println();
	}
	
}

private static int[][] makeTranspose(int[][] arr) {
	int [][]transpose=new int[arr.length][arr.length];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			transpose[i][j]=arr[j][i];
		}
	}
	return transpose;
}
}
