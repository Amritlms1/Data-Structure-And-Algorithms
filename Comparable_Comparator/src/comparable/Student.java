package comparable;

public class Student implements Comparable<Object>{
String name;
int age;
int id;
public Student(String name, int age, int id) {
	super();
	this.name = name;
	this.age = age;
	this.id = id;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
}
@Override
public int compareTo(Object o) {
	String name1=this.name;
	String name2=((Student)o).name;
	return name1.compareTo(name2);
}

}