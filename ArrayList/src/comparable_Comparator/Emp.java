package comparable_Comparator;

public class Emp implements Comparable{
String name;
int id;
double sal;
public Emp(String name, int id, double sal) {
	super();
	this.name = name;
	this.id = id;
	this.sal = sal;
}
@Override
public String toString() {
	return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
}
@Override
public int compareTo(Object o) {
	String name1=this.name;
	String name2=((Emp)o).name;
	return name1.compareTo(name2);
}
}
