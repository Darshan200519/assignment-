1.create an class with Name myPortFolio --> create an constructor and print whole info about u
Ans.


package HomeWork;

public class Myportfolio {
	
	
	public Myportfolio (String fname, String lname, int age, long mobno, String city, String currentstatus ) {
		System.out.println("First Name : " + fname );
		System.out.println("Last Name : " + lname );
		System.out.println("Age : " + age );
		System.out.println("Mobile No : " + mobno );
		System.out.println("City : " + city );
		System.out.println("Current Status : " + currentstatus );
		
		
	}

}
package HomeWork;

public class MainClassformyportfolio {
	public static void main(String[] args) {
		Myportfolio Boy = new Myportfolio("Darshan", "Narjinari", 21, 9767012284l, "Shirdi", "Student");
		
		
		
	}

}
--------------------------------------------------------------------------------------------------------------------------------------------------------------

2.create an class with Name Car --> create an constructor and print whole info about car and also add one method
Ans.

package HomeWork;

public class MyCar {
	
	public void CarPrice(int CarPrice , int CarInsuranceperiod) {
		
		System.out.println("My Car Price Is : " + CarPrice);
		System.out.println("Car Insurance Validity : " + CarInsuranceperiod + "Years");
		
	
		
	
		
	}
	
	public MyCar(String Carname,Long CarModelNo , int CarModelYear ,String Carcolor ,String CarNo) {
		System.out.println("My Car Name : " + Carname);
		System.out.println("My Car Model No : " + CarModelNo);
		System.out.println("My Car Model year : " + CarModelYear);
		System.out.println("My Car Color : " + Carcolor);
		System.out.println("My Car No : " + CarNo);
		
	}

}
package HomeWork;

public class MainClassforMyCar {
public static void main(String[] args) {
	MyCar HF = new MyCar ("Swift", 43646464644l, 2020, "Black", "MH17CT9286");
	HF.CarPrice(50000 , 5);
	
	
}

}
--------------------------------------------------------------------------------------------------------------------------------------------------------------

3.create an class with Name Employee --> create an constructor and print whole info about employee also add method (salary)
package HomeWork;

public class Employee {
	public Employee(String name, String Add ,int Id ,String Position ) {
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee Address : "+ Add);
		System.out.println("Employee Id : "+ Id);
		System.out.println("Employee Position : "+ Position);
				
	}
	public int Salary(int Salary , int PF) {
		System.out.println("Emoployee Salary : "+ Salary);
		System.out.println("PF : " + PF);
		System.out.println("Salary In bank Account :" + (Salary - PF));
		if(Salary > 50000) {
			System.out.println("High Salary");
		}else {
			System.out.println("Low Salary");
		}
		
		return 0;
		
	}

}
package HomeWork;

public class MainClassforEmployee {
	public static void main(String[] args) {
		Employee UBS = new Employee("Sonali Narjinari","Pune", 5464464 ,"Manager");
		UBS.Salary(70000,3500);
	}

}
--------------------------------------------------------------------------------------------------------------------------------------------------------------
4.create an class with Name Student --> create an constructor and print whole info about Student
Ans.
package HomeWork;

public class Student {
	public String College() {
		String CollegeName = "SaiBaba Jr College" ;
		String Collegegrade = "A++";
		String CollegeLocation = "Shirdi";
		String Collegecapacity = "5000";
		System.out.println("College Name :" + CollegeName);
		System.out.println("College Grade :" + Collegegrade );
		System.out.println("College Location :"+ CollegeLocation);
		System.out.println("College Capacity :"+ Collegecapacity);

		
		return null;	
	}
	public Student(String Name , String Address ,int Std , int CollegeID ,String Barnch ) {
		System.out.println("Student Name :"+Name);
		System.out.println("Student Address :"+Address);
		System.out.println("Student Std :"+Std);
		System.out.println("Student ID :"+CollegeID);
		System.out.println("Student Branch :"+Barnch);
		
	}

}
package HomeWork;

public class MainClassforStudent {
	public static void main(String[] args) {
		Student Law = new Student("Darshan Narjinari", "Shirdi", 11, 5404, "Science");
		
		Law.College();
	}

}



