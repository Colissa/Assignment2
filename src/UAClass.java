// Answer for Question #1 from Assignment 2.

// Represents a college class at the UofA.
public class UAClass {
    // Data members provided by Question #1 in Assignment 2.
    private String teacherFirstName, teacherLastName, semesterOffered;
    private int numCredits;

    public UAClass(){
    }

    // Constructs the UA Class' variables with input parameter.
    public UAClass(String teacherFirstName, String teacherLastName, String semesterOffered, int numCredits){
        this.teacherFirstName = teacherFirstName;
        this.teacherLastName = teacherLastName;
        this.semesterOffered = semesterOffered;
        this.numCredits = numCredits;
    }

    // Returns the first name of this class' teacher.
    public String getTeacherFirstName(){
        return teacherFirstName;
    }

    // Returns the last name of this class' teacher.
    public String getTeacherLastName(){
        return teacherLastName;
    }

    // Returns the semester that this class is offered.
    public String getSemesterOffered() {
        return semesterOffered;
    }

    // Returns the number of credits for this class.
    public int getNumCredits() {
        return numCredits;
    }

    // Sets the first name of this class' teacher.
    public void setTeacherFirstName(String teacherFirstName){
        this.teacherFirstName = teacherFirstName;
    }

    // Sets the last name of this class' teacher.
    public void setTeacherLastName(String teacherLastName){
        this.teacherLastName = teacherLastName;
    }

    // Sets the semester that this class is offered.
    public void setSemesterOffered(String semesterOffered){
        this.semesterOffered = semesterOffered;
    }

    // Sets the number of credits for this class.
    public void setNumCredits(int numCredits){
        this.numCredits = numCredits;
    }

    // Returns the string representation of this class.
    public String toString(){
        return "This course is taught by " + teacherFirstName + " " + teacherLastName + " and is offered in the " + semesterOffered + " for " + numCredits + " credits.";
    }

}
