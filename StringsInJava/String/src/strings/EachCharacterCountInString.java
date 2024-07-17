package strings;

import java.util.Scanner;

public class EachCharacterCountInString {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String s=sc.next();
	char[] c=s.toCharArray();
	int count;
	char ch;
	for(int i=0;i<s.length()-1;i++)
	{	
		count=1;
		if(c[i]!='\u0000')
		{
			for(int j=i+1;j<s.length();j++)
			{
			if(c[i]==c[j])
			{
				count++;
				c[j]='\u0000';
			}
			}
			System.out.println(c[i]+" = "+count);
		}

		
		
	}
}
}
