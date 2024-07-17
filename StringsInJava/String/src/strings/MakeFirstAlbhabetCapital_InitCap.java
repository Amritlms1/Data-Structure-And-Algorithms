package strings;

import java.util.Scanner;

public class MakeFirstAlbhabetCapital_InitCap {
public static void main(String []ar)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter full name");
	String name=sc.nextLine();
	char[] ch=name.toCharArray();
	for(int i=0;i<name.length();i++)
	{
		
		if(i==0||ch[i-1]==' ')
		{
			if(ch[i]>='a' && ch[i]<='z')ch[i]=(char) (ch[i]-32);
		}
	}
	String s1=new String(ch);
//	String s="";
//	for(int i=0;i<name.length();i++)
//	{
//		s+=ch[i];
//	}
	System.out.println("Your correct name format is  "+s1);
}
}
