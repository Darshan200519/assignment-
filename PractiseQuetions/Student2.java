package PractiseQuetions;

public class Student2 {
	
	    private String name;
	    private int marks;

	    public Student2(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }

	    public String getName() {
	        return name;
	    }

	    	    public int getMarks() {
	        return marks;
	    }

	    public String getGrade() {
	        if (marks >= 90) return "A+";
	        else if (marks >= 80) return "A";
	        else if (marks >= 70) return "B";
	        else if (marks >= 60) return "C";
	        else if (marks >= 50) return "D";
	        else return "F";
	    }
	}


