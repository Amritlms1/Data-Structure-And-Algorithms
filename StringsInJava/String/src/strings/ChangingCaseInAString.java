package strings;

import java.util.Scanner;

public class ChangingCaseInAString {
public static void main(String[] ar)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  a String");
	String s=sc.next();
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		char ch1=ch[i];
		if(ch1>='a' && ch1<='z')ch[i]=(char)(ch1-32);
		else if(ch1>='A'&& ch1<='Z')ch[i]=(char)(ch1+32);
	}
	String s1="";
	for(int j=0;j<ch.length;j++)s1+=ch[j];
	System.out.println("After changing case  "+s1);
	sc.close();
}
}
