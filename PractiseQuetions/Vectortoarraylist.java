package PractiseQuetions;

import java.util.Vector;
import java.util.ArrayList;

public class Vectortoarraylist {
    public static void main(String[] args) {
        
       
        Vector<Integer> vec = new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);

        
        ArrayList<Integer> list = new ArrayList<>(vec);

      
        System.out.println("ArrayList elements: " + list);
    }
}
