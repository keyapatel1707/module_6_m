package introduction;

import java.util.Scanner;

public class maximumnumber {
  
	public static int findmax(int a,int b,int c)
	{
		int max=a;
		if(b>max)
		{
		   max=b;
		}
		if(c>max)
		{
			max=c;
		}
		return max;
	}
			public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter number");
		int num1=scanner.nextInt();
		System.out.println("enter number");
		int num2=scanner.nextInt();
		System.out.println("enter number");
		int num3=scanner.nextInt();
		
		int max=findmax(num1,num2,num3);
		System.out.println("maximum number"+max);
		
	}
		
	
		

	}


