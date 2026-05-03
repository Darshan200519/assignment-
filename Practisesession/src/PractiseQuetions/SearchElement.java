package PractiseQuetions;

import java.util.LinkedList;

public class SearchElement {
    public static void main(String[] args) {
        
       
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

   
        int searchElement = 10;

        
        int position = list.indexOf(searchElement);

        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found in the list.");
        }
    }
}