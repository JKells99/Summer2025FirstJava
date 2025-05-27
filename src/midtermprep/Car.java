package midtermprep;
// This will inherit the properties of the Equipment class consider it police issued equipment
public class Car {
    private int carID;
    private String make;
    private String model;
    private String color;
    private String licensePlate;
    private String vin;
    private boolean undercoverCar;

    public Car(int carID, String make, String model, String color, String licensePlate, String vin, boolean undercoverCar) {
        this.carID = carID;
        this.make = make;
        this.model = model;
        this.color = color;
        this.licensePlate = licensePlate;
        this.vin = vin;
        this.undercoverCar = undercoverCar;
    }

    public Car(String make, String model, String color, String licensePlate, String vin, boolean undercoverCar) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licensePlate = licensePlate;
        this.vin = vin;
        this.undercoverCar = undercoverCar;
    }

    public Car() {
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public boolean isUndercoverCar() {
        return undercoverCar;
    }

    public void setUndercoverCar(boolean undercoverCar) {
        this.undercoverCar = undercoverCar;
    }
}
