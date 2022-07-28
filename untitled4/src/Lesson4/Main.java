package Lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(11);
        arraylist.add(2);
        arraylist.add(7);
        arraylist.add(3);

        System.out.println("Saralashdan oldin:");
        for (int counter : arraylist) {
            System.out.println(counter);
        }


        Collections.sort(arraylist);

        System.out.println("Saralashdan keyin:");
        for (int counter : arraylist) {
            System.out.println(counter);
        }
    }

}


