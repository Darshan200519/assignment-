package PractiseQuetions;

import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;

public class TransfertoAVL {
    public static void main(String[] args) {
        
       
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

       
        Vector<Integer> vector = new Vector<>();
        vector.addAll(arrayList);

        
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(vector);

       
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Vector: " + vector);
        System.out.println("LinkedList: " + linkedList);
    }
}
