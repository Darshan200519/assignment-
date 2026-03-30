package PractiseQuetions;

public class MainClassforMobile {
	public static void main(String[] args) {
		
		        Mobile myPhone = new Mobile("iPhone 15", 999.00);

		        myPhone.setPrice(950.00);

		        System.out.println("Mobile Model: " + myPhone.getModel());
		        System.out.println("Original Price: " + myPhone.getPrice());

		        double discountRate = 10.0;
		        double finalPrice = myPhone.getDiscountedPrice(discountRate);

		        System.out.println("Discount Rate: " + discountRate );
		        System.out.println("Price after Discount: " + finalPrice);
		    }
		}
