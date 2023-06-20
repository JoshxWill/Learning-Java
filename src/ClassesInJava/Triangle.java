package ClassesInJava;

//Creating a Class
public class Triangle {
    static int numOfsides = 3;
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;


    //Creating a Constructor
    public Triangle(double base, double height, double sideLenOne,
                    double sideLenTwo, double sideLenThree){
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    /*
    Base and height are non-static variables
        - their values change
    Static class variables do not change per instance
        -they hold a value for the whole class to use
     */
    public double findArea(){
        return (this.base * this.height) / 2;
    }
}
