package midtermprep;

import java.util.ArrayList;
import java.util.List;

// Each station will have many police officers assigned, an inventory of police gear, a list of cars, and a StationOpsSystem
public class PoliceStation {
    private int stationID;
    private String stationName;
    private String stationAddress;
    private List<PoliceOfficer> officers;
    private List<Equipment> inventory;
    private List<Car> cars;
    private List<Civilian> listOfCiviliansInBuilding;

    public PoliceStation(int stationID,String stationName,String stationAddress) {
        this.stationID = stationID;
        this.stationName = stationName;
        this.stationAddress = stationAddress;
        officers = new ArrayList<>();
        inventory = new ArrayList<>();
        cars = new ArrayList<>();
        listOfCiviliansInBuilding = new ArrayList<>();
    }

    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationAddress() {
        return stationAddress;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }

    public List<PoliceOfficer> getOfficers() {
        return officers;
    }

    public void setOfficers(List<PoliceOfficer> officers) {
        this.officers = officers;
    }

    public List<Equipment> getInventory() {
        return inventory;
    }

    public void setInventory(List<Equipment> inventory) {
        this.inventory = inventory;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Civilian> getListOfCiviliansInBuilding() {
        return listOfCiviliansInBuilding;
    }

    public void setListOfCiviliansInBuilding(List<Civilian> listOfCiviliansInBuilding) {
        this.listOfCiviliansInBuilding = listOfCiviliansInBuilding;
    }
}
