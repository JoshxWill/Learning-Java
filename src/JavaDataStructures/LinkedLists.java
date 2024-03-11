package JavaDataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedLists {

    public static void main(String[] args) {
        //Create ArrayLists
        ArrayList<String> bucketGetters = new ArrayList<>();

        bucketGetters.add("Kevin Durant");
        bucketGetters.add("Steph Curry");
        bucketGetters.add("Jayson Tatum");
        bucketGetters.add("Kawhi Leonard");
        bucketGetters.add("Devin Booker");

        Collections.sort(bucketGetters);
        System.out.println(bucketGetters);
        for (String i : bucketGetters){
            System.out.println(i);
        }
    }
}
