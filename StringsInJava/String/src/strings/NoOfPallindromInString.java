package strings;

import java.util.Scanner;

public class NoOfPallindromInString {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String:");
	String s=sc.next();
	int index=s.length()-1;
	for(int i=0;i<s.length()-1;i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
		if(isPallindrom(s,i,j))System.out.print(s.substring(i,j+1)+"   ");	
		}
	}
}

private static boolean isPallindrom(String s, int i, int j) {
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
