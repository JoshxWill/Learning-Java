package ClassesInJava;

public class MainStudentProfile {
    public static void main(String[] args) {
        StudentProfileChallenge profileOne = new StudentProfileChallenge("Joshua",
                "Williams", "Software Engineering", 3.75, 2023);

        StudentProfileChallenge profileTwo = new StudentProfileChallenge("Natalie", "Williams",
                "Information Systems", 3.45,
                2025);

        profileOne.incrementExpectedYearToGraduate();
        System.out.println(profileOne.expectedYearToGraduate);
    }
}
