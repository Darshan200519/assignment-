package PracticeonAbstraction;

public class MainforVehiclesystem {
	public static void main(String[] args) {
		Vehiclesystem B = new Bike();
		B.start();
		B.stop();
		
		System.out.println("-------------------------------------------------");
		B = new Car () ;
		B.start();
		B.stop(); 
		
		
	}

}
