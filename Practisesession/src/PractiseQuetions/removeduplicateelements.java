package PractiseQuetions;

import java.util.ArrayList;
import java.util.HashSet;

public class removeduplicateelements {
    public static void main(String[] args) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);

       
        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

     
        System.out.println("ArrayList after removing duplicates: " + list);
    }
}