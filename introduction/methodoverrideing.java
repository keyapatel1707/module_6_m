package introduction;

class first
{
	public void display()
	{
		System.out.println("this is first class");
	}
}

class second extends first
{
	public void display()
	{
		System.out.println("this is  second class");
	}
}
public class methodoverrideing {

	public static void main(String[] args) {
		 first f1= new first();
		 f1.display();
		 
		 f1=new second();
		 f1.display();
	}

}
