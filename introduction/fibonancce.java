package introduction;

public class fibonancce {

	public static void main(String[] args) {
		int n=10, kp=0,ip=1;
		System.out.println("Fibonacci Series "+n);
		for(int i=1;i<=n;++i)
		{
			System.out.println(kp+",");
			int nk= kp+ip;
			kp=ip;
			ip=nk;
		}
	}

}
