package ControlFlow;

import java.util.Scanner;

public class MultipleChoiceChallenge {
    public static void main(String[] args) {
        String question = "Who won the Superbowl in 2023?";
        String choiceOne = "Eagles";
        String choiceTwo = "Chiefs";
        String choiceThree = "Ravens";

        String correctAnswer = choiceTwo;
        //TODO: Write a print statement asking the question
        System.out.println(question);

        //TODO: Write a print statement giving the answer choices
        System.out.println("Answer choices: " + " A. " + choiceOne + " B. " + choiceTwo
                + " C. " + choiceThree);
        //TODO: Have the user input an answer
        Scanner scanner = new Scanner(System.in);

        //TODO: Retrieve the user's input
        String input = scanner.next();

        //TODO: If user's input matches the correctAnswer
        if (correctAnswer.equals(input)){
            //TODO: If the user is correct then print congrats message
            System.out.println("Congrats. Your correct!");
        } else {
            //TODO: If the user incorrect then print incorrect message
            System.out.println("You are incorrect. The correct answer is " + correctAnswer);
        }
    }
}
