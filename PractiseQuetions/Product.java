package PractiseQuetions;

public class Product {
	private String ProductName ;
	private double ProductPrice ;
	private double DicountPercentage ;
	private double DiscountTotalonProduct;
	private double ProdcutPriceAfterDiscount ;
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		this.ProductName = productName;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(double productPrice) {
		this.ProductPrice = productPrice;
	}
	public double getDicountPercentage() {
		return DicountPercentage;
	}
	public void setDicountPercentage(double dicountPercentage) {
		this.DicountPercentage = dicountPercentage;
	}
	
	public double getDiscountTotalonProduct() {
		return DiscountTotalonProduct;
	}
	public void setDiscountTotalonProduct(double discountTotalonProduct) {
		this.DiscountTotalonProduct = ProductPrice * DicountPercentage /100 ;
	}
	public double getProdcutPriceAfterDiscount() {
		return ProdcutPriceAfterDiscount;
	}
	public void setProdcutPriceAfterDiscount(double prodcutPriceAfterDiscount) {
		
		this.ProdcutPriceAfterDiscount = ProductPrice - DiscountTotalonProduct ;
	}
	

}
