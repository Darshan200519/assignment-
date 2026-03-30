package PractiseQuetions;

public class MainClassforBankAccount {
	public static void main(String[] args) {
		BankAccount  D = new BankAccount() ;
		System.out.println("---------------Welcome To Our Bank-------------------");
		D.setDepositAmount(50000);
		D.setWithdrawAmount(500);
		D.setRemainingBalance(0);
		System.out.println("Deposit Amount : " + D.getDepositAmount());
		System.out.println("Withdraw Amount : " + D.getWithdrawAmount());
		System.out.println("Remaining Balance : " + D.getRemainingBalance());
	}

}
