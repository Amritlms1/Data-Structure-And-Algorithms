package howToCreateMultiThread;

public class ByRunnableInterface {
public static void main(String ar[])
{
	MyTh t=new MyTh();
	Thread t1=new Thread(t);
	t1.start();
	for(int i=67;i<=77;i++)
	{
		System.out.println(""+(char)i);
	}
}

}
class MyTh implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(""+i);
		}
		
	}
	
}
