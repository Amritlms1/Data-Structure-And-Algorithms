package queue_Using_ArrayList;

public class Test {
public static void main(String ar[])
{
	Queue q=new Queue();
	q.push(10);
	q.push(20);
	q.push(30);
	q.push(40);
	q.push(50);
	System.out.print(q.poll()+" ");
	System.out.print(q.poll()+" ");
	System.out.print(q.poll()+" ");
	System.out.print(q.poll()+" ");
	System.out.print(q.poll()+" ");
}
}
