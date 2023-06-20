import java.util.Scanner;

/*
    Data Types in Java:
    Primitive Types: int, double, char, boolean, etc.
    Referenced Types
 */
public class DataTypes {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;

        //Strings in Java
        String studentFName = "Joshua";
        String studentLName = "Williams";

        //Using indexes with strings
        char studentFirstInit = studentFName.charAt(0);
        char studentLastInit = studentLName.charAt(0);
        boolean hasPerfectAttendence = true;



        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInit);
        System.out.println(studentLastInit);
        System.out.println(hasPerfectAttendence);
        System.out.println(studentFName);
        System.out.println(studentLName);

        //Concatenating strings
        System.out.println(studentFName + " " + studentLName + " has a GPA of " + studentGPA);

        //Input and Output in Java
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFName + " " + studentLName +
                " has a GPA of " + studentGPA);

    }
}
