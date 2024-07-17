package strings;

import java.util.Scanner;

public class CompareStringLexicoGraphically {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 String:-");
	String s=sc.next();
	String s1=sc.next();
	if(s.compareTo(s1)>0)System.out.println(s+"  Is LexicoGraphycally Greater");
	else System.out.println(s1+"  Is LexicoGraphycally Greater");
	sc.close();
}
}
