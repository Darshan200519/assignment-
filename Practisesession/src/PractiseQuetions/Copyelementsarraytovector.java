package PractiseQuetions;

import java.util.ArrayList;
import java.util.Vector;

public class Copyelementsarraytovector {
    public static void main(String[] args) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        
        Vector<Integer> vec = new Vector<>();

    
        vec.addAll(list);

     
        System.out.println("Vector elements: " + vec);
    }
}