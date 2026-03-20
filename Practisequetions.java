package oops;

public class Practicequetions {
	public static void main(String[] args) {
////		1.
//		
//		        
//
//		        for (int i = 1; i <= 5; i++) {
//		            char ch = 'A'; 
//		            for (int j = 1; j <= i; j++) {
//		                System.out.print(ch);
//		                ch++; 
//		            }
//		            System.out.println(); 
//		        }
////		 2.
//		        
//		                
//
//		                
//		                for (int i = 1; i <= 5; i++) {
//		                    for (int j = 1; j <= i; j++) {
//		                        System.out.print("*");
//		                    }
//		                    System.out.println();
//		                }
//
//		                
//		                for (int i = 5 - 1; i >= 1; i--) {
//		                    for (int j = 1; j <= i; j++) {
//		                        System.out.print("*");
//		                    }
//		                    System.out.println();
//		                }
////		   3.
//		                
//		                        
//
//		                        for (int i = 1; i <= 5; i++) {
//		                            for (int j = 1; j <= i; j++) {
//		                                
//		                                if ((i + j) % 2 == 0) {
//		                                    System.out.print(1);
//		                                } else {
//		                                    System.out.print(0);
//		                                }
//		                            }
//		                            
//		                            System.out.println();
//		                        }
//		    4.
		            
		
		                        
		                        
//	--------------------------------------------------------------------------------------------------------------------------------	                        
//		1.
//		int Languages = 6 ;
//		    switch(Languages) {
//		    case 1 : {
//		    	System.out.println("Java");
//		    	break;
//		    }
//		    case 2 : {
//		    	System.out.println("Python");
//		    	break;
//		    }
//		    case 3 : {
//		    	System.out.println("C++*");
//		    	break;
//		    }
//		    case 4 : {
//		    	System.out.println("Javascript");
//		    	break;
//		    }
//		    case 5 : {
//		    	System.out.println("SQL");
//		    	break;
//		    } default:{
//		    	System.out.println("The Languages are not available");
//		    }
//		    2.
//		    int areas = 3 ;
//		    switch(areas) {
//		    case 1 : {
//		    	System.out.println("Circle");
//		    	break;
//		    }
//		    case 2 : {
//		    	System.out.println("Square");
//		    	break;
//		    }
//		    case 3 : {
//		    	System.out.println("Rectangle");
//		    	break;
//		    }default:{
//		    	System.out.println("This Shape Is Not Avialable");
//		    }
//		    3.
//		    int Data = 4 ;
//		    switch(Data) {
//		    case 1 : {
//		    	System.out.println("Login Acces");
//		    	break;
//		    }
//		    case 2 : {
//		    	System.out.println("Invalid Password");
//		    	break;
//		    }
//		    case 3 : {
//		    	System.out.println("Acount Locked");
//		    	break;
//		    }default:{
//		    	System.out.println("******************Invalid Choice********");
//		    }
//      }
		                    
		            
		        
// 		
	
	
// }
		   ---------------------------------------------------------------------------------------------------------------------------------------------
         1. 
         package oops;

public class Students {
	int StudentId;
	String StudentName;

}
  }
  package oops;

public class MainClassforStudents {
	public static void main(String[] args) {
		Students std = new Students();
		
		std.StudentId = 2423 ;
		std.StudentName = "Darshan";
		
		System.out.println("Student ID = " + std.StudentId);
		System.out.println("Student Name =" + std.StudentName);
	}

}
2. -----------------------------------------------------------------------------------------------------------------------------------------------------
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
	junior.employeeSalary = 60000;
	if(junior.employeeSalary >50000) {
		System.out.println("High Salary");
	}else {
		System.out.println("done");
	}
	System.out.println("Employee Name : "+junior.employeeName);
	System.out.println("Employee Id : "+junior.employeeId);
	System.out.println("Employee Salary : "+junior.employeeSalary);
	
	}
}

3.--------------------------------------------------------------------------------------------------------------------------------------------------------
  package oops;

public class Bankaccount {
int balance ;
}

package oops;

public class MainClassforBankaccount {
	public static void main(String[] args) {
		Bankaccount Darshan = new Bankaccount ();
		
		Darshan.balance = 500;
		if (Darshan.balance < 1000) {
			System.out.println("low balance");
		}else {
			System.out.println("Ok");
		}
		
	}

}


	
		    
		    
		    
		   
