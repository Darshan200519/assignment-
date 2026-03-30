package PractiseQuetions;

public class MainClassforStudent2 {
	public static void main(String[] args) {
		Student2 student = new Student2("Darshan Narjinari", 10);
		Student2 student3 = new Student2("Sonali Narjinari", 56);
		
        System.out.println("Name:  " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Name:  " + student3.getName());
        System.out.println("Marks: " + student3.getMarks());
        System.out.println("Grade: " + student3.getGrade());
	
	}

}
