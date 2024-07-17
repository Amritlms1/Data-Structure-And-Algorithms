package howToCreateMultiThread;

public class ByThreadClass {
public static void main(String ar[])
{
	MyTh1 t=new MyTh1();
	t.start();
	for(int i=67;i<=77;i++)
	{
		System.out.println(""+(char)i);
	}
}
}
class MyTh1 extends Thread
{	@Override
	public void run()
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println(""+i);
	}
	}
	
}
