package PracticeonAbstraction;

public class Currentaccount extends Bankaccount {
double InterestBalance ;
	
	public void displayBalance() {
		
		System.out.println("Balance of Saving account " + getAccountBalance() );

	}

	
	void calculateInterest(int InterestPer) {
		double InterestBalance = (getAccountBalance() * InterestPer )/100 ;
		System.out.println(" Balance with Interest : " + InterestBalance);
		this.InterestBalance = InterestBalance ;
		
	}


	
	void DisplaythebalanceafterInterest() {
		System.out.println("Total Balance : " + (InterestBalance + getAccountBalance()));
		
		
	}
	
		
		
	
	

}
