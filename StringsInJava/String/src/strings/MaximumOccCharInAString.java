package strings;

import java.util.Scanner;

public class  MaximumOccCharInAString{
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String:-");
	String s=sc.next();
	char[] ch=s.toCharArray();
	int store=0;
	char c = 0 ;
	int count=1;
	for(int i=0;i<ch.length-1;i++)
	{
		count=1;
		if(ch[i]!='\u0000')
		{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
				{
				count++;
				ch[j]='\u0000';
				}
		}
		if(count>store)
		{
			store=count;
			c=ch[i];
		}
		ch[i]='\u0000';
	}
}
	System.out.println(c+" = "+store);
}
}