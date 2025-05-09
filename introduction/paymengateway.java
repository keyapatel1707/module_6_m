package introduction;

interface paymentgateway
{
	void processpayment(double amount);
}
 class cred implements paymentgateway
 {
	 @Override
	 public void processpayment(double amount)
	 {
		 System.out.println("process cred"+amount+"r");
	 }
 }
 
 class netpay implements paymentgateway
 {
	 @Override
	 public void processpayment(double amount)
	 {
		 System.out.println("process cred"+amount+"r");
	 
	 }
	 
 }

public class paymengateway {

	public static void main(String[] args) {
		paymentgateway cp= new cred();
		paymentgateway np= new netpay();
cp.processpayment(100.00);
np.processpayment(200.00);
	}

}
