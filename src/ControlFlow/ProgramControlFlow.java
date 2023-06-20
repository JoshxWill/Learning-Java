package ControlFlow;

import java.util.Scanner;

//Control flow statements if, else, else-if etc.
public class ProgramControlFlow {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();

        if (inputtedNum < 5){
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe will make you happy today");
        }
    }
}


