package stack_Using_ArrayList;

public class Test {
	public static void main(String ar[])
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.print(s.peek()+"  ");
		System.out.print(s.pop()+"  ");
		System.out.print(s.peek()+"  ");
		System.out.print(s.pop()+"  ");
	}
}
