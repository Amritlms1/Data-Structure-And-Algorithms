package strings;

import java.util.Scanner;

public class ChangeRepetedAlphabetInStringWith_$ {
public static void main(String ar[])
{
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the String");
		String s=sc.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				char ch1=ch[i];
				if(ch1==ch[j])
				{
					ch[j]='$';
				}
			}
		}
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1+=ch[i];
		}
		System.out.println("The Changed String is   "+s1);
	}
}
}
