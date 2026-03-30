package PractiseQuetions;

public class MainClassforProduct {
	public static void main(String[] args) {
		Product H = new Product();
		System.out.println("--------------Welcome To Our Store ----------------");
		
		H.setProductName("Sugar");
		H.setProductPrice(1000);
		H.setDicountPercentage(10);
		H.setDiscountTotalonProduct(0);
		H.setProdcutPriceAfterDiscount(0);
		
		
		System.out.println("Product Name : " + H.getProductName());
		System.out.println("Product Price : " + H.getProductPrice());
		System.out.println("Dicount Perccentage :" + H.getDicountPercentage());
		System.out.println("Total Dicount : "+ H.getDiscountTotalonProduct());
		System.out.println("Product Price After Dicount : " + H.getProdcutPriceAfterDiscount());
		
		
	}

}
