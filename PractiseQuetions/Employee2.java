package PractiseQuetions;

public class Employee2 {
	
	    private String name;
	    private double salary;

	    public Employee2(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public void increment() {
	        double increase = this.salary * 0.10;
	        this.salary += increase;
	    }

	    public void displayDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Final Salary:  $" + String.format("%.2f", salary)); 
	    }
	}


