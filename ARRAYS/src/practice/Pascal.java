package practice;

public class Pascal {
public static void main(String ar[])
{
	int arr[][]=new int[5][];
	diagram(arr);
	int space=4,st=1;
	for(int i=0;i<arr.length;i++)
	{
		for(int k=0;k<space;k++)System.out.print(" ");
		for(int j=0;j<st;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		space--;
		st+=1;
	}
	
}

private static void diagram(int[][] arr) {
for(int i=0;i<arr.length;i++)
{
	arr[i]=new int[i+1];
	for(int j=0;j<arr[i].length;j++)
	{
		if(i==j || i+j==i)arr[i][j]=1;
		else arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
	}
}
	
}
}
