package introduction;
 class message
 {
	 public void display(String msg)
	 {
			System.out.println("["+msg);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("]"+msg);
	 }
 }
 class synch extends Thread
 {
	 String msg;
	 message m1;
	public synch(message m1 ,String msg)
	{

		this.msg = msg;
		this.m1 = m1;
 }
 public void run()
 {
	 synchronized(m1)
	 {
		 m1.display(msg);
	 }
 }
 }
public class synch1 {

	public static void main(String[] args) 
	{
		message m = new message();
		synch s1 = new synch(m, "Hello");
		synch s2 = new synch(m, "Kese ho app!!");
		synch s3 = new synch(m, "Chalo byeee...");
		s1.start();
		s2.start();
		s3.start();

	}

}
