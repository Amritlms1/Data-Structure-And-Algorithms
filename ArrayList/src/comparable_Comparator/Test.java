package comparable_Comparator;

import java.util.Arrays;

public class Test {
public static void main(String ar[])
{
	Emp[] arr=
		{
				new Emp("Amrit",106,9000),
				new Emp("Ajit",104,900000),
				new Emp("Asu",105,90000),
				new Emp("As",105,90),
				new Emp("Au",105,9),
				new Emp("su",105,1)
		};
	Arrays.sort(arr,new Sal_Com());;
	for(Emp e:arr)
	{
		System.out.println(e);
	}
}
}
