package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameEmailPhoneNumValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String exp="[a-z][a-z0-9[.]]+@[ge]mail[.]com";//Email
		String exp1="[9876][0-9]{9}";//phone num
		String exp2="([A-Z])([a-z]){1,}";//Name
		
		
		
		System.out.println("Enter a mail ID");
		String s=sc.next();
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		boolean b=m.matches();
		
		
		
		
		System.out.println("Enter FirstName only AND First letter should capital");
		String s1=sc.next();
		Pattern p1=Pattern.compile(exp2);
		Matcher m1=p.matcher(s1);
		boolean b1=m.matches();
		
		
		System.out.println("Enter your Phone Num");
		String s2=sc.next();
		Pattern p2=Pattern.compile(exp1);
		Matcher m2=p.matcher(s2);
		boolean b2=m.matches();
		if(b1 && b2 && b)System.out.print("All valid");
		else {
			if(b==false)System.out.println("Email Is not valid");
			if(b1==false)System.out.println("phone Is not valid");
			if(b2==false)System.out.print("Name format Is Invalid");
			}
			
	}

}
