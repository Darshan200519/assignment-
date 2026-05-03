package PractiseQuetions;

import java.util.ArrayList;

public class Comparetwoarraylist {
    public static void main(String[] args) {
        
      
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

       
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

      
        if (list1.equals(list2)) {
            System.out.println("Both ArrayLists are equal.");
        } else {
            System.out.println("ArrayLists are not equal.");
        }
    }
}
