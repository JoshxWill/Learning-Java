package ClassesInJava;

public class StudentProfileChallenge {
    String firstName;
    String lastName;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public StudentProfileChallenge(String firstName,String lastName,
                                   String declaredMajor, double gpa,
                                   int expectedYearToGraduate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedYearToGraduate(){
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }
}
