package midtermprep;

import java.util.stream.Collectors;

// This is where all the main ops logic will live, I want to ba able to print various reports, update officers, add officers, update and manage equipment, and manage cars
// This will use the police station class to manage the police officers and cars
public class StationOpsSystem {

    PoliceStation policeStation;
    public StationOpsSystem(PoliceStation policeStation) {
        this.policeStation = policeStation;
    }

    public void printStationInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(policeStation.getStationName());
        sb.append(" Police Station\n");
        sb.append("Address: ");
        sb.append(policeStation.getStationAddress());
        System.out.println(sb.toString());

    }

    public void addOfficerToStation(PoliceOfficer officer) {
        try {
            if (officer == null) {
                System.out.println("Officer cannot be null");
                return;
            }
            if (officer.getBadgeNumber() < 1000) {
                System.out.println("Officer badge is invalid must be be 1xxx or greater");
                return;
            }
            policeStation.getOfficers().add(officer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public void removeOfficerFromStation(PoliceOfficer officer) {
        try {
            if (officer == null) {
                System.out.println("Officer cannot be null");
                return;
            }
            if (!policeStation.getOfficers().contains(officer)) {
                System.out.println("Officer not found in the station");
                return;
            }
            policeStation.getOfficers().remove(officer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void addCivilianEmployeeToStation(Civilian civilian) {
        try {
            if (civilian == null) {
                System.out.println("Civilian cannot be null");
                return;
            }
            policeStation.getListOfCiviliansInBuilding().add(civilian);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void removeCivilianEmployeeFromStation(Civilian civilian) {
        try {
            if (civilian == null) {
                System.out.println("Civilian cannot be null");
                return;
            }
            if (!policeStation.getListOfCiviliansInBuilding().contains(civilian)) {
                System.out.println("Civilian not found in the station");
                return;
            }
            policeStation.getListOfCiviliansInBuilding().remove(civilian);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void assignCarToStation(Car car) {
        try {
            if (car == null) {
                System.out.println("Car cannot be null");
                return;
            }
            policeStation.getCars().add(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void removeCarFromStation(Car car) {
        try {
            if (car == null) {
                System.out.println("Car cannot be null");
                return;
            }
            if (!policeStation.getCars().contains(car)) {
                System.out.println("Car not found in the station");
                return;
            }
            policeStation.getCars().remove(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void addEquipmentToStation(Equipment equipment) {
        try {
            if (equipment == null) {
                System.out.println("Equipment cannot be null");
                return;
            }
            policeStation.getInventory().add(equipment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
public void removeEquipmentFromStation(Equipment equipment) {
        try {
            if (equipment == null) {
                System.out.println("Equipment cannot be null");
                return;
            }
            if (!policeStation.getInventory().contains(equipment)) {
                System.out.println("Equipment not found in the station");
                return;
            }
            policeStation.getInventory().remove(equipment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void assignEquipmentToOfficer(PoliceOfficer officer, Equipment equipment) {
        try {
            if (officer == null || equipment == null) {
                System.out.println("Officer or Equipment cannot be null");
                return;
            }
            if (!policeStation.getOfficers().contains(officer)) {
                System.out.println("Officer not found in the station");
                return;
            }
            if (!policeStation.getInventory().contains(equipment)) {
                System.out.println("Equipment not found in the station");
                return;
            }
            officer.getIssuedEquipment().add(equipment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void issueCarToOfficer(PoliceOfficer officer, Car car) {
        try {
            if (officer == null || car == null) {
                System.out.println("Officer or Car cannot be null");
                return;
            }
            if (!policeStation.getOfficers().contains(officer)) {
                System.out.println("Officer not found in the station");
                return;
            }
            if (!policeStation.getCars().contains(car)) {
                System.out.println("Car not found in the station");
                return;
            }
            officer.setIssuedCar(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void printStationInventoryReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Station Inventory Report\n");
        for (Equipment equipment : policeStation.getInventory()) {
           sb.append(equipment.toString());
        }
        System.out.println(sb);
    }

    public void checkEquipmentLevelsRestockIfNeeded(){
        StringBuilder sb = new StringBuilder();
        sb.append("Equipment Restock Report\n");
        for (Equipment equipment : policeStation.getInventory()) {
            if (equipment.getQuantityInStock() < 20) {
                sb.append("Equipment: ");
                sb.append(equipment.getSerialNumber());
                sb.append(" needs restocking. Current quantity: ");
                sb.append(equipment.getQuantityInStock());
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public void setUnderCoverStatusForCar(Car car) {
        try {
            if (car == null) {
                System.out.println("Car cannot be null");
                return;
            }
            if (!policeStation.getCars().contains(car)) {
                System.out.println("Car not found in the station");
                return;
            }
            car.setUndercoverCar(true);
            System.out.println("Car " + car.getLicensePlate() + " is now assigned to undercover.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void printGearCarReport(){
        StringBuilder sb = new StringBuilder();
        sb.append("Gear and Car Report\n");
        for (PoliceOfficer officer : policeStation.getOfficers()) {
            sb.append("Officer: ");
            sb.append(officer.getFirstName());
            sb.append(" ");
            sb.append(officer.getLastName());
            sb.append("\n");
            sb.append("Issued Car: ");
            if (officer.getIssuedCar() != null) {
                sb.append(officer.getIssuedCar().getLicensePlate());
            } else {
                sb.append("No car assigned");
            }
            sb.append("\n");
            sb.append("Issued Equipment:\n");
            for (Equipment equipment : officer.getIssuedEquipment()) {
                sb.append("- ");
                sb.append(equipment.getSerialNumber());
                sb.append(" (");
                sb.append(equipment.getType());
                sb.append(")\n");
            }
        }
        System.out.println(sb.toString());
    }

    public void searchOfficerByName(String firstName, String lastName) {
        StringBuilder sb = new StringBuilder();
        sb.append("Searching for Officer: ");
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        sb.append("\n");
        boolean found = false;
        for (PoliceOfficer officer : policeStation.getOfficers()) {
            if (officer.getFirstName().equalsIgnoreCase(firstName) && officer.getLastName().equalsIgnoreCase(lastName)) {
                sb.append("Officer Found: ");
                sb.append(officer.getFirstName());
                sb.append(" ");
                sb.append(officer.getLastName());
                sb.append("\n");
                found = true;
            }
        }
        if (!found) {
            sb.append("No officer found with the name: ");
            sb.append(firstName);
            sb.append(" ");
            sb.append(lastName);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public void searchCarByVin(String vin) {
        StringBuilder sb = new StringBuilder();
        sb.append("Searching for Car with VIN: ");
        sb.append(vin);
        sb.append("\n");
        boolean found = false;
        for (Car car : policeStation.getCars()) {
            if (car.getVin().equalsIgnoreCase(vin)) {
                sb.append("Car Found: ");
                sb.append(car.getMake());
                sb.append(" ");
                sb.append(car.getModel());
                sb.append(" (");
                sb.append(car.getLicensePlate());
                sb.append(")\n");
                found = true;
            }
        }
        if (!found) {
            sb.append("No car found with VIN: ");
            sb.append(vin);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public void printListOfOfficersGroupByRank() {
        System.out.println("Officers Grouped by Rank");
        policeStation.getOfficers().stream()
                .collect(Collectors.groupingBy(PoliceOfficer::getRank))
                .forEach((rank, officers) -> {
                    System.out.println(rank + "s:");
                    officers.forEach(officer -> System.out.println("- " + officer.getFirstName()));
                });
    }






    public void printOfficerInfoReport(){
        StringBuilder sb = new StringBuilder();
        sb.append("Officer Report\n");
        for (PoliceOfficer officer : policeStation.getOfficers()) {
            sb.append("Officer Name: ");
            sb.append(officer.getFirstName());
            sb.append(" ");
            sb.append(officer.getLastName());
            sb.append("\n");
            sb.append("Badge Number: ");
            sb.append(officer.getBadgeNumber());
            sb.append("\n");
            sb.append("Rank: ");
            sb.append(officer.getRank());
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }


}
