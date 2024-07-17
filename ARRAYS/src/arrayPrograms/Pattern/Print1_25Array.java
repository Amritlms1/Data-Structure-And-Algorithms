package arrayPrograms.Pattern;

public class Print1_25Array {
public static void main(String ar[])
{
	int arr[][]= {{1,2,3,4,5},
			      {6,7,8,9,10},
			      {11,12,13,14,15},
			      {16,17,18,19,20},
			      {21,22,23,24,25}};
	display(arr);
}

private static void display(int[][] arr) {
	int row=0,column=-1;
	char dir='r';
	for(int i=1;i<=arr.length*arr.length;i++)
	{
		if(i==6 || i==11 || i==16 || i==21)System.out.println();
		if(dir=='r')
		{
		column++;
		System.out.print(arr[row][column]+"\t");
		if(column==arr.length-1-row)dir='d';
		}
		else if(dir=='d')
		{
			row++;
			System.out.print(arr[row][column]+"\t");
			if(row==column)dir='l';
		}
		else if(dir=='l')
		{
			column--;
			System.out.print(arr[row][column]+"\t");
			if(column==arr.length-1-row)dir='u';
		}
		else if(dir=='u')
		{
			row--;
			System.out.print(arr[row][column]+"\t");
			if(row==column+1)dir='r';
		}
//		if(row==column && row!=0)System.out.println();
	}
}
}
