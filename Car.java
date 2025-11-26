// Author: Sean Smith
public class Car extends Vehicle {
    private double gasMileage;
    private int numberOfPassengers;

    // Default constructor
    public Car() {
        super();
        this.gasMileage = 1.0;
        this.numberOfPassengers = 1;
    }

    // Parameterized constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName,
               double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName);
        setGasMileage(gasMileage);
        setNumberOfPassengers(numberOfPassengers);
    }

    // Accessors
    public double getGasMileage() {
        return gasMileage;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    // Mutators
    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0) {
            this.gasMileage = gasMileage;
        } else {
            this.gasMileage = 1.0;
        }
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers >= 0) {
            this.numberOfPassengers = numberOfPassengers;
        } else {
            this.numberOfPassengers = 1;
        }
    }

    public boolean equals(Car other) {
        if (other == null) return false;
        return super.equals(other)
            && this.gasMileage == other.gasMileage
            && this.numberOfPassengers == other.numberOfPassengers;
    }

    // ToString method
    public String toString() {
        return super.toString()
             + "Gas Mileage: " + gasMileage + "\n"
             + "Number of Passengers: " + numberOfPassengers + "\n";
    }
}
