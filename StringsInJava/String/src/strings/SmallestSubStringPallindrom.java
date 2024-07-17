package strings;

import java.util.Scanner;

public class SmallestSubStringPallindrom {
public static void main(String[] ar)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.next();
	int x = 0,y = 0;
	int length=s.length();
	for(int i=0;i<s.length()-1;i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(ispallindrom(s,i,j))
			{
				if(length>s.substring(i,j+1).length())
					{
					length=s.substring(i,j+1).length();
					x=i;
					y=j+1;
					}
			}
		}
	}
	System.out.println(length);
	System.out.println(s.substring(x,y));
}

private static boolean ispallindrom(String s, int i, int j) {
	s=s.toLowerCase();
	int start=i;
	int end=j;
	while(start<end)
	{
		if(s.charAt(start)!=s.charAt(end))return false;
		start++;
		end--;
	}
	return true;
}

}
