package ClassesInJava;

//Classes help organize our code
    //They contain attributes, also referred to as properties, and behaviors, also referred to as methods
    //Every class contains a constructor that can create instances

public class TriangleMain {
    public static void main(String[] args) {
        //Creating an Instance
        Triangle triangleA = new Triangle(15, 8, 15,
                8, 17);
        Triangle triangleB = new Triangle(3, 2.598,
                3, 3, 3);
        //Using instance and class methods
        double triangleAArea = triangleA.findArea();
        //Triangle.findArea() --> Math.pow(2, 3)
        System.out.println(triangleAArea);
        //sideLenThree = instance variable
        System.out.println(triangleA.sideLenThree);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);
        //Base = instance variable
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfsides);

    }
}
