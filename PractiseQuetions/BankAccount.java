package PractiseQuetions;

public class BankAccount {
	private double DepositAmount ;
	private double WithdrawAmount ;
	private double RemainingBalance ;
	public double getDepositAmount() {
		return DepositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.DepositAmount = depositAmount;
	}
	public double getWithdrawAmount() {
		return WithdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.WithdrawAmount = withdrawAmount;
	}
	public double getRemainingBalance() {
		return RemainingBalance;
	}
	public void setRemainingBalance(double remainingBalance) {
		this.RemainingBalance = DepositAmount - WithdrawAmount;
	}
	

}
