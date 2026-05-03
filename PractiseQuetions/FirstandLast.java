package PractiseQuetions;

import java.util.LinkedList;

public class FirstandLast {
    public static void main(String[] args) {
        
        
        LinkedList<Integer> list = new LinkedList<>();


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

     
        int firstElement = list.getFirst();
        int lastElement = list.getLast();

      
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}