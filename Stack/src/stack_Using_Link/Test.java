package stack_Using_Link;

public class Test {
public static void main(String ar[])
{
	Stack s=new Stack();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	System.out.print(s.peek()+"\n");
	for(int i=0;i<s.size();i++)
	{
		System.out.print(s.get(i)+" ");
	}
	System.out.print("\n"+s.pop()+"\n");
}
}
