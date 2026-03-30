package PractiseQuetions;

public class MainClassforCar {
	public static void main(String[] args) {
		
	
	Car mycar = new Car() ;
	mycar.setBrandName("BMW");
	mycar.setCarPrice(500000);
	
	System.out.println("Car Brand Name : " + mycar.getBrandName());
	System.out.println("Car Price : " + mycar.getCarPrice());
	}
}
