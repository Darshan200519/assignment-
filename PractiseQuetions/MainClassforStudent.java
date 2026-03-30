package PractiseQuetions;

public class MainClassforStudent {
	public static void main(String[] args) {
		Student G = new Student();
		G.setstudId(504);
		G.setstudId("Darshan");
		System.out.println("Student ID : " + G.getstudId()  );
		System.out.println("Student Name  : " + G.getstudName()  );

	}

}
