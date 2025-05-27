package midtermprep;
// Inheritance from Person
public class Civilian  extends Person {
    private String occupation;
    private boolean passedBackgroundCheck;

    public Civilian(int personalID, String firstName, String lastName, String address, String phoneNumber, String email, String occupation, boolean passedBackgroundCheck) {
        super(personalID, firstName, lastName, address, phoneNumber, email);
        this.occupation = occupation;
        this.passedBackgroundCheck = passedBackgroundCheck;
    }
    public Civilian() {
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isPassedBackgroundCheck() {
        return passedBackgroundCheck;
    }

    public void setPassedBackgroundCheck(boolean passedBackgroundCheck) {
        this.passedBackgroundCheck = passedBackgroundCheck;
    }
}
