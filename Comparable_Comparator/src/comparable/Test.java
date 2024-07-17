package comparable;

import java.util.Arrays;

public class Test {
public static void main(String ar[])
{
	Student[] s= {new Student("Amrit",21,1),
				 new Student("amrit",21,3),
				 new Student("it",21,2)};
	Arrays.sort(s,null);
	for(Student a:s)
	System.out.println(a);
	
}
}
