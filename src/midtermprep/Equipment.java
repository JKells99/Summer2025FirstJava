package midtermprep;
// Parent class for all equipment
public class Equipment {
    private String serialNumber;
    private String type;
    private String brand;
    private String model;
    private String color;
    private int quantityInStock;

    public Equipment(String serialNumber, String type, String brand, String model, String color,int quantityInStock) {
        this.serialNumber = serialNumber;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.quantityInStock = quantityInStock;
    }

    public Equipment() {
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}
