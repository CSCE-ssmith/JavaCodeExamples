// Author: Sean Smith
public class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;

    // Default constructor
    public Truck() {
        super();
        this.loadCapacity = 1.0;
        this.towingCapacity = 1.0;
    }

    // Parameterized constructor
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName,
                 double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownerName);
        setLoadCapacity(loadCapacity);
        setTowingCapacity(towingCapacity);
    }

    // Accessors
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    // Mutators
    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity >= 0) {
            this.loadCapacity = loadCapacity;
        } else {
            this.loadCapacity = 1.0;
        }
    }

    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity >= 0) {
            this.towingCapacity = towingCapacity;
        } else {
            this.towingCapacity = 1.0;
        }
    }

    public boolean equals(Truck other) {
        if (other == null) return false;
        return super.equals(other)
            && this.loadCapacity == other.loadCapacity
            && this.towingCapacity == other.towingCapacity;
    }

    // ToString method
    public String toString() {
        return super.toString()
             + "Towing Capacity: " + towingCapacity + "\n"
             + "Load Capacity: " + loadCapacity + "\n";
    }
}