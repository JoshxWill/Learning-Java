package JavaDataStructures;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
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
    }
}
