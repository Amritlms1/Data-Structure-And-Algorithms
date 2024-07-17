package comparable;

import java.util.Comparator;

public class IdCompare implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		int id1=((Student)o1).id;
		int id2=((Student)o2).id;
		if(id1>id2)return 1;
		if(id2>id1)return -1;
		return 0;
	}

}
