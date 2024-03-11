package PracticeGym;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Basics {
    public static void main(String[] args) {

        //Declaring an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] bucketScores;

        //Method 1
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("-----------------");

        //Method 2
        for (String i : cars){
            System.out.println(i);
        }

        // Initializing the array with size 5
        bucketScores = new int[5];
        bucketScores[0] = 40;
        bucketScores[1] = 45;
        bucketScores[2] = 50;
        bucketScores[3] = 55;
        bucketScores[4] = 60;

        System.out.println(Arrays.toString(bucketScores));
        System.out.println(Arrays.toString(cars));

        //For Loop - bucketScores
        for (Integer i: bucketScores){
            System.out.println(i);
        }



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


        //Create Hashmaps
        HashMap<String, Integer> playersPPG = new HashMap<>();

        //Adding Keys and Values (Players, Points Per Game)
        playersPPG.put("Kevin Durant", 40);
        playersPPG.put("Steph Curry", 45);
        playersPPG.put("Jayson Tatum", 50);
        playersPPG.put("Kawhi Leonard", 55);
        playersPPG.put("Devin Booker", 60);

        System.out.println(playersPPG);
        System.out.println(playersPPG.size());


        //Switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }



    }
}
