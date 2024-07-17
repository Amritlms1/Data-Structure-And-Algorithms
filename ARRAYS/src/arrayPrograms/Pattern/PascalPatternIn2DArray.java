package arrayPrograms.Pattern;

public class PascalPatternIn2DArray {
public static void main(String ar[])
{
	int [][] arr=new int[5][];
	int x=5;
	arr=addElement(arr,x);
	int space=4;
	for(int i=0;i<arr.length;i++)
	{
		for(int sp=space;sp>=0;sp--)System.out.print(" ");
		for(int j=0;j<arr[i].length;j++)
		{
		System.out.print(arr[i][j]+" ");	
		}
		System.out.println();
		space--;
	}
	
}

private static int[][] addElement(int[][] arr,int x) {
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=new int[i+1];
		for(int j=0;j<arr[i].length;j++)
		{
			if(i==j || i+j==i)arr[i][j]=1;
			else arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
		}
		
	}
	return arr;
}
}
