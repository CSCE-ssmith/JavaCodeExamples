// Author: Sean Smith

public class Vehicle {
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default constructor
    public Vehicle() {
        this.manufacturerName = "none";
        this.numberOfCylinders = 6;
        this.ownerName = "none";
    }

    // Parameterized constructor
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) {
        setManufacturerName(manufacturerName);
        setNumberOfCylinders(numberOfCylinders);
        setOwnerName(ownerName);
    }

    // Accessors
    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Mutators
    public void setManufacturerName(String manufacturerName) {
        if (manufacturerName != null && !manufacturerName.isEmpty()) {
            this.manufacturerName = manufacturerName;
        } else {
            this.manufacturerName = "none";
        }
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        if (numberOfCylinders > 0) {
            this.numberOfCylinders = numberOfCylinders;
        } else {
            this.numberOfCylinders = 6;
        }
    }

    public void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.isEmpty()) {
            this.ownerName = ownerName;
        } else {
            this.ownerName = "none";
        }
    }

    public boolean equals(Vehicle other) {
        if (other == null) return false;
        return this.manufacturerName.equals(other.manufacturerName)
            && this.numberOfCylinders == other.numberOfCylinders
            && this.ownerName.equals(other.ownerName);
    }

    // ToString method
    public String toString() {
        return "Manufacturer's Name: " + manufacturerName + "\n"
             + "Number Of Cylinders: " + numberOfCylinders + "\n"
             + "Owner's Name: " + ownerName + "\n";
    }
}