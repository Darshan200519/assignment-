package PractiseQuetions;
 
	import java.util.Vector;

	public class VectorExample {
	    public static void main(String[] args) {
	        
	       
	        Vector<Integer> numbers = new Vector<>();

	        
	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);
	        numbers.add(25);

	   
	        System.out.println("Elements in Vector:");
	        for (int num : numbers) {
	            System.out.println(num);
	        }
	    }
	}

