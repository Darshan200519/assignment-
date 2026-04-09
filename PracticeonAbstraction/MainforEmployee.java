package PracticeonAbstraction;



public class MainforEmployee {
	public static void main(String[] args) {
		
	
//		EmployeeSalarySystem c = new FullTimeEmployee() ;
//		c.calculateSalary();
//		c = new PartTimeEmployee ();
//		c.calculateSalary();
		Company c = new Company();
		c.show(new FullTimeEmployee ());
		c.show(new PartTimeEmployee () );
			
			
		
	}
}
