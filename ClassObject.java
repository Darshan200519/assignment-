// Q1. Create a class Laptop
// Variables → brand, ram
package oops;

public class Laptop {
	String brandname;
	double ram;

}

package oops;

public class Mainclassforlaptop {
	public static void main(String[] args) {
		Laptop lenovo = new Laptop();
		lenovo.brandname = "LOQ";
		lenovo.ram = 4.0;
		System.out.println("Brand name = "+lenovo.brandname);
		System.out.println("Ram Size = "+lenovo.ram+"Gb");

		
		
	}

}
--------------------------------------------------------------------------------------------------------------------------------------------------------
// Q2. Create a class Employee
// Variables → id, name, salary
package oops;

public class Employee {
		long employeeId ;
		String employeeName;
		double employeeSalary;

}

package oops;

public class MainClassforEmployee {
	public static void main(String[] args) {
		
	
	Employee junior = new Employee ();
	junior.employeeId = 97670122;
	junior.employeeName = "Darshan";
	junior.employeeSalary = 50000;
	System.out.println("Employee Name : "+junior.employeeName);
	System.out.println("Employee Id : "+junior.employeeId);
	System.out.println("Employee Salary : "+junior.employeeSalary);
	
	}
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q3. Create a class Car
// Variables → model, price, color
package oops;

public class Car {
	int Carprice;
	int modelno;
	String clr;
	double cc;
	boolean hybrid = true;
	
	
	
	

}
package oops;

public class MainClassforCar {
	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.Carprice = 3000000;
		bmw.modelno = 2026;
		bmw.clr = "White";
		bmw.cc = 300;
		bmw.hybrid = true ;
		if(bmw.hybrid) {
			System.out.println("Car Hybrid or Not  = " + "Its hybrid Car");
		}else {
			System.out.println("Car Hybrid or Not  = " + "Its not hybrid Car");
			
		}
		System.out.println("Car Price = "+ bmw.Carprice);
		System.out.println("Car Modelno. = "+ bmw.modelno);
		System.out.println("Car Color = "+ bmw.clr);
		System.out.println("Car Engine CC = "+ bmw.cc);
		
	}
	
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q4. Create a class Book
// Variables → title, author, price
package oops;

public class Book {
	String BookTitle;
	String BookAuthor;
	int Bookprice ;

}
package oops;

public class MainClassforBook {
	public static void main(String[] args) {
		Book Chaava = new Book();
		
		Chaava.BookTitle = "SwarajrakshakSambhajiMaharaj";
		Chaava.BookAuthor = "Shivaji Savant";
		Chaava.Bookprice = 600;
		
		System.out.println("Book Title =" + Chaava.BookTitle);
		System.out.println("Book Author =" + Chaava.BookAuthor);
		System.out.println("Book Price =" + Chaava.Bookprice);
	}

}


