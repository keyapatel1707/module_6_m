package introduction;

 class addition
 {
	 int x,y;
	 public void sum()
	 {
		 x=10;
		 y=20;
		 System.out.println("first sum"+(x+y));
	 }
	 public void sum(int a)
	 {
		 x=a;
		 y=a;
		 System.out.println("secound sum"+(x+y));
	 }
	 public void sum(float a)
	 {
		 x=y=(int)a;
		 System.out.println("float sum"+(x+y));
	 }
	 public void sum(int a,int b)
	 {
		 x=a;
		 y=b;
		 System.out.println("third sum"+(x+y));
	 }
 }

public class methodoverriding {

	public static void main(String[] args) 
	{
		addition a1= new addition();
		a1.sum();
		a1.sum(123);
		a1.sum(45,65);
		a1.sum(75.65f);
	}

}
