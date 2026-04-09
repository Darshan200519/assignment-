package PracticeonAbstraction;

public class Mainshape {
	public static void main(String[] args) {
		
		Shape S ;
		S = new Rectangle (); 
		S.area(50, 100, 0, 0);
		
		S = new Circle ();
		S.area(0, 0, 0, 10);
		
		S = new Triangle ();
		S.area(10, 0, 50, 0);
		
	}

}
