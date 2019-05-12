// Answer for Question #2 from Assignment 2.

// Represents an online college student at the UofA.
public class OnlineStudent extends Student {

    // Data members provided by Question #2 in Assignment 2.
    private String currentLocation, currentAffiliation;

    // Constructs the online student without parameter input and initializing the current location to "Arizona" and the current affiliation to "TEP".
    public OnlineStudent(){
        super();
        currentLocation = "Arizona";
        currentAffiliation = "TEP";
    }

    // Constructs the online student's variables with input parameter.
    public OnlineStudent(String firstName, String lastName, String departmentIn, int yearGraduation, UAClass[] currentClasses, int[] grades, String currentLocation, String currentAffiliation){
        super(firstName, lastName, departmentIn,  yearGraduation, currentClasses, grades);
        this.currentLocation = currentLocation;
        this.currentAffiliation = currentAffiliation;
    }

    // Returns the current location of this online student.
    public String getCurrentLocation(){
        return currentLocation;
    }

    // Returns the current affiliation of this online student.
    public String getCurrentAffiliation(){
        return currentAffiliation;
    }

    // Sets the online student's current location.
    public void setCurrentLocation(String currentLocation){
        this.currentLocation = currentLocation;
    }

    // Sets the online student's current affiliation.
    public void setCurrentAffiliation(String currentAffiliation){
        this.currentAffiliation = currentAffiliation;
    }

    // Returns the string representation of the online student which includes the current location and affiliation.
    public String toString(){
        return "Online Student's current location is " + currentLocation + " and their current affiliation is " + currentAffiliation + ".";
    }

    // Returns the calculated GPA for the online student.
    public String calculateGPA(){
        return this.getFirstName() + " " + this.getLastName() + "'s current GPA = " + super.getGPA() + " Current location = " + currentLocation + ". Current affiliation = " + currentAffiliation + ".";
    }
}
