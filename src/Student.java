// Answer for Question #1 from Assignment 2.

// Represents a college student.
public class Student {
    // Data members provided by Question #1 in Assignment 2.
    private String firstName, lastName, departmentIn;
    private int yearGraduation;
    private UAClass[] currentClasses;
    private int[] grades;

    public Student() {
    }

    // Constructs the student's variables with input parameter.
    public Student(String firstName, String lastName, String departmentIn, int yearGraduation, UAClass[] currentClasses, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentIn = departmentIn;
        this.yearGraduation = yearGraduation;
        this.currentClasses = currentClasses;
        this.grades = grades;
    }

    // Returns the first name of this student.
    public String getFirstName() {
        return firstName;
    }

    // Returns the last name of this student.
    public String getLastName() {
        return lastName;
    }

    // Returns the department name this student is in.
    public String getDepartmentIn() {
        return departmentIn;
    }

    // Returns the graduation year of this student.
    public int getYearGraduation() {
        return yearGraduation;
    }

    // Returns the current classes this student is taking.
    public UAClass[] getCurrentClasses() {
        return currentClasses;
    }

    // Returns the grades of this student.
    public int[] getGrades() {
        return grades;
    }

    // Sets the student's first name.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Sets the student's last name.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Sets the student's department.
    public void setDepartmentIn(String departmentIn) {
        this.departmentIn = departmentIn;
    }

    // Sets the student's graduation year.
    public void setYearGraduation(int yearGraduation) {
        this.yearGraduation = yearGraduation;
    }

    // Sets the student's current classes.
    public void setCurrentClasses(UAClass[] currentClasses) {
        this.currentClasses = currentClasses;
    }

    // Sets the student's grades.
    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    // Returns the student's first name, last name and current classes.
    public String getGPA() {
        double credits = 0;
        double gradedCredits = 0;

        for (int i = 0; i < this.currentClasses.length; i++) {
            credits = credits + this.currentClasses[i].getNumCredits();
            gradedCredits = gradedCredits + this.currentClasses[i].getNumCredits() * this.getGrades()[i];
        }

        return this.getFirstName() + " " + this.getLastName() + "'s current GPA = " + gradedCredits / credits + ".";
    }

    public static void main(String[] args) {

        // Part of Question #1 & #2 from Assignment 2.
        // Creates a list of UAClasses, a list of grades, a new student, and gets her GPA.
        UAClass c1 = new UAClass("Sally", "May", "Spring", 3);
        UAClass c2 = new UAClass("Bally", "Day", "Fall", 4);
        UAClass c3 = new UAClass("Price", "Kay", "Spring", 5);
        UAClass c4 = new UAClass("Kelly", "Say", "Fall", 3);
        UAClass[] s1Classes = {c1, c2, c3, c4};

        int c1Grades = 4;
        int c2Grades = 2;
        int c3Grades = 4;
        int c4Grades = 3;
        int[] s1Grades = {c1Grades, c2Grades, c3Grades, c4Grades};

        Student s1 = new Student("Jasmine", "Mathias", "Psych", 2020, s1Classes, s1Grades);
        System.out.println(s1.getGPA());


        // Part of Question #2 from Assignment 2.
        // Creates a list of online UAClasses, a new list of grades, an online student, and prints out her calculated GPA.
        OnlineUAClass oC1 = new OnlineUAClass("Sally", "May", "Spring", 1, "Fed", "Durst");
        OnlineUAClass  oC2 = new OnlineUAClass ("Bally", "Day", "Fall", 3, "Paul", "Rud");
        OnlineUAClass oC3 = new OnlineUAClass ("Price", "Kay", "Spring", 3, "Stephanie", "Cable");
        UAClass[] oS1Classes = {oC1, oC2, oC3};

        int oC1Grades = 3;
        int oC2Grades = 4;
        int oC3Grades = 3;
        int[] oS1Grades = {oC1Grades, oC2Grades, oC3Grades};

        OnlineStudent oS1 = new OnlineStudent("Christine", "Julia", "Science", 2019, oS1Classes, oS1Grades, "AZ", "UofA");
        System.out.println(oS1.calculateGPA());
    }
}




















