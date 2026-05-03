package PractiseQuetions;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        
        
        Vector<Integer> vec = new Vector<>();

       
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);

       
        int searchElement = 60;

        if (vec.contains(searchElement)) {
            System.out.println("Element " + searchElement + " exists in the vector.");
        } else {
            System.out.println("Element " + searchElement + " does not exist in the vector.");
        }
    }
}