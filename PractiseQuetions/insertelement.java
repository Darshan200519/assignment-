package PractiseQuetions;

import java.util.LinkedList;

public class insertelement {
    public static void main(String[] args) {
        
       
        LinkedList<Integer> list = new LinkedList<>();

       
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

       
        int index = 2;
        int element = 25;

  
        if (index >= 0 && index <= list.size()) {
            list.add(index, element);
            System.out.println("Element inserted successfully.");
        } else {
            System.out.println("Invalid position.");
        }

        
        System.out.println("Updated LinkedList: " + list);
    }
}
