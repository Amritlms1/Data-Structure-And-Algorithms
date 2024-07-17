package strings;

import java.util.Scanner;

public class pallindrom {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String:");
	String s=sc.next();
	int index=s.length()-1;
	
		if(isPallindrome(s,index))System.out.println(s+"  It is a Pallindrom String:");
		else System.out.println(s+"  It is not a Pallindrom String:");
	
}

private static boolean isPallindrome(String s,int index) {
	s=s.toLowerCase();
	for(int i=0;i<s.length()/2;i++)
	{
	if(s.charAt(i)!=s.charAt(index))return false;
	index--;
	}
	
	return true;
}
}
