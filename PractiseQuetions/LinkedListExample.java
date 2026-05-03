package PractiseQuetions;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        

        LinkedList<String> list = new LinkedList<>();

        
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Orange");

        
        System.out.println("Elements in LinkedList:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
