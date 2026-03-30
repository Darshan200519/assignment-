package PractiseQuetions;

public class Mobile {

	    private String model;
	    private double price;

	    public Mobile(String model, double price) {
	        this.model = model;
	        this.price = price;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public double getPrice() {
	        return price;
	    }

	   
	    public void setPrice(double price) {
	        if (price > 0) {
	            this.price = price;
	        }
	    }

	  
	    public double getDiscountedPrice(double percentage) {
	        double discountAmount = price * (percentage / 100);
	        return price - discountAmount;
	    }
	}


