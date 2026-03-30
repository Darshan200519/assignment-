package PractiseQuetions;

public class Employee {
	private double Salary ;

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		if(salary > 10000) {
			System.out.println(" Done ; Your Elgible For Next Process");
			this.Salary = salary;
			
		} else {
			System.out.println("Error ; Your Salary Is Not Greater Than 10000");
			this.Salary = salary;
			
		}
		
	}
	

}
