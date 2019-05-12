// Answer for Question #2 from Assignment 2.

// Represents an online college class at the UofA.
public class OnlineUAClass extends UAClass{

    // Data members provided by Question #2 in Assignment 2.
    private String onlineTAFirstName, onlineTALastName;

    // Constructs the online class without parameter input and initializing the first and last name of the TA to "Sami" "Sam".
    public OnlineUAClass(){
        super();
        onlineTAFirstName = "Sami";
        onlineTALastName = "Sam";
    }

    // Constructs the online UA Class' variables with input parameter.
    public OnlineUAClass(String teacherFirstName, String teacherLastName, String semesterOffered, int numCredits, String onlineTAFirstName, String onlineTALastName){
        super(teacherFirstName, teacherLastName, semesterOffered, numCredits);
        this.onlineTAFirstName = onlineTAFirstName;
        this.onlineTALastName = onlineTALastName;
    }

    // Returns the first name of this online class' TA.
    public String getOnlineTAFirstName(){
        return onlineTAFirstName;
    }

    // Returns the last name of this online class' TA.
    public String getOnlineTALastName(){
        return onlineTALastName;
    }

    // Sets the first name of this online class' TA.
    public void setOnlineTAFirstName(String onlineTAFirstName){
        this.onlineTAFirstName = onlineTAFirstName;
    }

    // Sets the last name of this online class' TA.
    public void setOnlineTALastName(String onlineTALastName){
        this.onlineTALastName = onlineTALastName;
    }

    // Returns the string representation of the class' TA.
    public String toString(){
        return "The TA's name for this class is " + onlineTAFirstName + " " + onlineTALastName + ".";
    }
}
