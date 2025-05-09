package introduction;

public class implicit {

	public static void main(String[] args) {
		int a=20;
		long l;
		
		l=a;
		System.out.println("Implicit is"+l);
		
		int b=(int)l;
		System.out.println("Explicit is"+b);
		

	}

}
