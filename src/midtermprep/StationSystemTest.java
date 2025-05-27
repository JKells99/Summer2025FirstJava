package midtermprep;

public class StationSystemTest {
    public static void main(String[] args) {
        PoliceStation station = new PoliceStation(1, "Central", "123 Main St");
        StationOpsSystem opsSystem = new StationOpsSystem(station);
        opsSystem.printStationInfo();
        // Add some officers
        PoliceOfficer testOfficer = new PoliceOfficer(
                1001, "John", "Doe", "456 Test Ave", "555-1234", "johndoe@test.com", "Sergeant", 1234, null
        );

        PoliceOfficer testOfficer1 = new PoliceOfficer(
                1002, "John", "Nolan", "456 Test Ave", "555-1234", "johnn@test.com", "Rookie", 1234, null
        );




      opsSystem.addOfficerToStation(testOfficer1);
        opsSystem.addOfficerToStation(testOfficer);
        // Print officer info
        opsSystem.printOfficerInfoReport();
        opsSystem.printListOfOfficersGroupByRank();
    }

}
