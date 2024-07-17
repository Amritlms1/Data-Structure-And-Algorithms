package queue_Using_LinkedList;

public class Test {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		for(int i=0;i<q.size();i++)
		{
			System.out.print(q.get(i)+" ");
		}
		System.out.print("\n"+"The result of pool= "+q.pool()+"\n");
		for(int i=0;i<q.size();i++)
		{
			System.out.print(q.get(i)+" ");
		}
		System.out.print("\n"+"The result of pool= "+q.peek()+"\n");
		for(int i=0;i<q.size();i++)
		{
			System.out.print(q.get(i)+" ");
		}
	}

}
