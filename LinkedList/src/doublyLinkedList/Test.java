package doublyLinkedList;

public class Test {
	public static void main(String[] ar)
	{
		DoublyLinkedList l=new DoublyLinkedList ();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(3);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			
			System.out.print(l.get(i)+"\t");
		}
		l.add(23,2);
		System.out.println();
		for(int i=0;i<l.size();i++)
		{
			
			System.out.print(l.get(i)+"\t");
		}
	}
}
