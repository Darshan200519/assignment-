package PractiseQuetions;

import java.util.Vector;

public class countelements {
    public static void main(String[] args) {
        
        
        Vector<Integer> vec = new Vector<>();

      
        vec.add(5);
        vec.add(10);
        vec.add(15);
        vec.add(20);

       
        int count = vec.size();

        
        System.out.println("Total number of elements in Vector: " + count);
    }
}
