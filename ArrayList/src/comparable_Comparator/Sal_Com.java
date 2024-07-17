package comparable_Comparator;

import java.util.Comparator;

public class Sal_Com implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		double sal1=((Emp)o1).sal;
		double sal2=((Emp)o2).sal;
		if(sal1>sal2)return 1;
		if(sal2>sal1)return -1;
		return 0;
	}

}
