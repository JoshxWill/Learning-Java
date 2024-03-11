package JavaDataStructures;

import java.util.Comparator;
import java.util.Set;

public class TreeSet {

    public static void main(String[] args) {
        //Create TreeSet
        Set<Integer> treeSet = new java.util.TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);
        System.out.println(treeSet);

        //No Duplicates in TreeSet
        treeSet.add(6);
        System.out.println(treeSet);

        Set<String> wordSet = new java.util.TreeSet<>(Comparator.comparing(String::length));
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet);

        wordSet.add("wolf");
        System.out.println(wordSet);
    }
}
