package PractiseQuetions;

public class MainClassforAccount {
	public static void main(String[] args) {
		Account Da = new Account() ;
		Da.setAccountBal(50000);
		System.out.println("Account Balance : " + Da.getAccountBal());
		Da.depositAmount(60000);
		Da.withdrawAmount(10000);
		Da.setRemainingBalance(0);
		System.out.println("Remaining Balance After Withdrawl : " + Da.getRemainingBalance());
	}

}
