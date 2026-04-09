package PracticeonAbstraction;

public abstract class Bankaccount {
	private double totalBalance ;
	private int accountBalance ;
	 abstract void calculateInterest(int InterestPer) ;
	 
	 public void displayBalance() {
		 
	 }

	 public int getAccountBalance() {
		return accountBalance;
	 }

	 public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	 }
	 abstract void DisplaythebalanceafterInterest() ;

	 
	 

}
