package JavaAlgorithms.ArrayAlgorithms;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearchArrays {
    public static Integer linearSearchArrays(int[] arr, int item) {
        for (int current : arr) {
            if (current == item){
                return item;
            }
        }

        return null;
    }

    public static OptionalInt linearSearchArrays2(int[] arr, int item){
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearchArrays(arr, 1));
        System.out.println(linearSearchArrays(arr, 8));

    }
}