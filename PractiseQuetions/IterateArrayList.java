package PractiseQuetions;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {
    public static void main(String[] args) {
        
        
        ArrayList<String> list = new ArrayList<>();

       
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

    
        Iterator<String> it = list.iterator();

      
        System.out.println("ArrayList elements:");
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }
    }
}