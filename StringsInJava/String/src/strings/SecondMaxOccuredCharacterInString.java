package strings;

import java.util.Scanner;

public class SecondMaxOccuredCharacterInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter a String");
		String s=sc.next();
		int occured=1;
		int x=s.length();
		int y=0;
		char c = 0;
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			occured=1;
			if(ch[i]!='\u0000')
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(ch[i]==ch[j])
					{
						occured++;
						ch[j]='\u0000';
					}
				}
				if(occured<x)
				{
					c=ch[i];
					x=occured;
					y++;
				}
				ch[i]='\u0000';
				if(y==2)
				{
					
					break;
				}
			}
			
		
		}
		System.out.println(c+"  "+x);

	}

}
