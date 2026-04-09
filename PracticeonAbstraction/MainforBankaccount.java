package PracticeonAbstraction;

public class MainforBankaccount {
	public static void main(String[] args) {
		
		Bankaccount S = new SavingAccount() ; 
		S.setAccountBalance(10000);
		S.displayBalance();
		S.calculateInterest(5);
		S.DisplaythebalanceafterInterest();
		System.out.println("-------------------------------------------");
		Bankaccount C = new Currentaccount() ; 
		C.setAccountBalance(50000);
		C.displayBalance();
		C.calculateInterest(5);
		C.DisplaythebalanceafterInterest();
		
		
	}
}
