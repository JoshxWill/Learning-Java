package JavaDataStructures;

public class Arrays {

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

        System.out.println(java.util.Arrays.toString(bucketScores));
        System.out.println(java.util.Arrays.toString(cars));

        //For Loop - bucketScores
        for (Integer i: bucketScores){
            System.out.println(i);
        }
    }


}
