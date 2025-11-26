// Author: Sean Smith
// Lab 08 - FleetDriver (Test Program)

public class FleetDriver {
    public static void main(String[] args) {
        // Create a Car
        Car car = new Car("Nissan", 6, "QWERTY", 29.0, 5);
        
        // Create a Truck
        Truck truck = new Truck("Chevy", 8, "ASDF01", 1.0, 2.0);
        
        // Create an unclassified Vehicle
        Vehicle vehicle = new Vehicle("Ford", 6, "ASDF02");

        // Print them to simulate the fleet
        System.out.println("The Fleet currently\n");
        System.out.println(car);
        System.out.println(truck);
        System.out.println(vehicle);
    }
}
