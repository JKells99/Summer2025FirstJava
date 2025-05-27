package midtermprep;
// will be used to create a police officer and inherit the properties of the Person class, Each police officer will have a rank and
// a badge number. The rank will be a string and the badge number will be an integer
// Each officer will have a list of issued equipment, which will be a list of PoliceGear objects
// Each officer will also have a issued car to them, Each car can have 2 officers assigned to it it a shift

import java.util.ArrayList;
import java.util.List;

public class PoliceOfficer extends Person {
    private String rank;
    private int badgeNumber;
    private List<Equipment> issuedEquipment;
    private Car issuedCar;

    public PoliceOfficer(int personalID, String firstName, String lastName, String address, String phoneNumber, String email, String rank, int badgeNumber, Car issuedCar) {
        super(personalID, firstName, lastName, address, phoneNumber, email);
        this.rank = rank;
        this.badgeNumber = badgeNumber;
        this.issuedEquipment = new ArrayList<>();
        this.issuedCar = issuedCar;
    }

    public PoliceOfficer(String rank, int badgeNumber, Car issuedCar) {
        this.rank = rank;
        this.badgeNumber = badgeNumber;
        this.issuedEquipment = new ArrayList<>();
        this.issuedCar = issuedCar;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public List<Equipment> getIssuedEquipment() {
        return issuedEquipment;
    }

    public void setIssuedEquipment(List<Equipment> issuedEquipment) {
        this.issuedEquipment = issuedEquipment;
    }

    public Car getIssuedCar() {
        return issuedCar;
    }

    public void setIssuedCar(Car issuedCar) {
        this.issuedCar = issuedCar;
    }
}
