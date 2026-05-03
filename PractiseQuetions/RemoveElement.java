package PractiseQuetions;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        
        
        ArrayList<Integer> list = new ArrayList<>();

        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        
        Integer elementToRemove = 60;

     
        if (list.remove(elementToRemove)) {
            System.out.println("Element " + elementToRemove + " removed successfully.");
        } else {
            System.out.println("Element not found in the list.");
        }

        
        System.out.println(" ArrayList: " + list);
    }
}
