package PracticeonAbstraction;

public class MainforPayment {
	public static void main(String[] args) {
		
		Payment p;
		p = new CreditCardPayment();
		p.pay(10000);
		
		p = new UPIpayment();
		p.pay(20000);
		
		p= new Netbanking ();
		p.pay(30000);
	}

}
