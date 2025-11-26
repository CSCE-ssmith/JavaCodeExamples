// Sean Smith
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Print the welcome message
        System.out.println("Welcome to Triangle Maker! Enter the size of the triangle.");
        // Gets an input from the user
        if (input.hasNextInt()) {
            int size = input.nextInt(); 
            // Check if the input is a positive and not 0
            if (size > 0) {
                for (int i = 1; i <= size; i++) {
                    printStars(i); 
                }
                for (int i = size - 1; i >= 1; i--) {
                    printStars(i); 
                }
                System.out.println("\nDONE!");
            } else {
                // If the number is zero or negative
                System.out.println("Error: You must enter a positive number or a whole number.");
            }
        } else {
            // If the input is not an integer
            System.out.println("Error: Invalid input. Please enter a whole number.");
        }

        input.close(); 
    }
    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println(); 
    }
}