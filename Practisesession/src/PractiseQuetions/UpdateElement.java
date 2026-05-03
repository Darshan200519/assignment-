package PractiseQuetions;

import java.util.Vector;

public class UpdateElement {
    public static void main(String[] args) {
        
     
        Vector<Integer> vec = new Vector<>();

        
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);

        
        int index = 3;
        int newValue = 100;

  
        if (index >= 0 && index < vec.size()) {
            vec.set(index, newValue);
            System.out.println("Element updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }

    
        System.out.println("Updated Vector: " + vec);
    }
}
