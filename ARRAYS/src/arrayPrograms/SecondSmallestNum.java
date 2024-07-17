package arrayPrograms;

public class SecondSmallestNum {
public static void main(String[] ar)
{
	int x[]= {6,5,4,3,2,1};
	int n1=x[0],n2=x[0];
	for(int i=0;i<x.length;i++)
	{
		if(x[i]==n1)continue;
		if(x[i]<n1)
		{
			n2=n1;
			n1=x[i];
		}
		else if(n1==n2 || x[i]<n2)
			n2=x[i];
	}
	System.out.print("second Smallest ="+n2);
}
}
