package PractiseQuetions;

public class Account {
	private int AccountBal;
	private int DepositAmount;
	private int TotalBalance ;
	private int WithdrawAmount ;
	private int RemainingBalance ;

	public int getAccountBal() {
		return AccountBal;
	}

	public void setAccountBal(int accountBal) {
		this.AccountBal = accountBal;
		
	}
	public Account () {
		this.AccountBal = AccountBal ;
	}
	public void depositAmount( int DepositAmount) {
		System.out.println("Deposit Amount : " + DepositAmount);
		this.DepositAmount=DepositAmount;
		this.TotalBalance = AccountBal +DepositAmount ;
		System.out.println("Total Balance After Deposit Amount : " + TotalBalance);
	}
	public void withdrawAmount(int amount2) {
		System.out.println("Withdraw Amount : "+ amount2);
		this.WithdrawAmount = amount2 ;		
	
	}

	public int getRemainingBalance() {
		return RemainingBalance;
	}

	public void setRemainingBalance(int remainingBalance) {
		this.RemainingBalance = TotalBalance - WithdrawAmount;
		
	}
}
