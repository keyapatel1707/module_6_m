package introduction;
 import java.util.Scanner;
public class exception 
{

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter no 1");
			int a=sc.nextInt();
			System.out.println("enter no 2");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("divi"+c);
			System.out.println("programe complete");
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("devlop by");
			System.out.println("keya patel");
			System.out.println("mo:3212165495");
		}

	}

}
