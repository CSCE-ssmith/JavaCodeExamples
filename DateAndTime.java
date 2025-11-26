// Sean Smith
import java.util.Scanner;
public class DateAndTime {
    // Method to run the main logic
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
            String input = scanner.nextLine();
            if (isValid(input)) {
                System.out.println("The date and time is valid!");
            } else {
                System.out.println("The date and time is not valid");
            }
            System.out.println("Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue");
            String quit = scanner.nextLine();
            if (quit.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye");
                break;
            }
        }
    }
    // Method to validate the whole string
    public boolean isValid(String input) {
        input = input.trim();
        String[] parts = input.split(" ");
        if (parts.length != 2) {
            return false;
        }
        String datePart = parts[0];
        String timePart = parts[1];
        return isValidDate(datePart) && isValidTime(timePart);
    }
    // Method to validate the date 
    public boolean isValidDate(String dateStr) {
        int month = getMonth(dateStr);
        int day = getDay(dateStr);
        if (month < 1 || month > 12) {
            return false;
        }
        int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return day >= 1 && day <= daysInMonth[month];
    }
    // Method to validate the time 
    public boolean isValidTime(String timeStr) {
        int hour = getHour(timeStr);
        int minute = getMinute(timeStr);

        return (hour >= 1 && hour <= 12) && (minute >= 0 && minute <= 59);
    }
    public int getMonth(String dateStr) {
        int slashIndex = dateStr.indexOf('/');
        if (slashIndex == -1) {
            return -1;
        }
        try {
            return Integer.parseInt(dateStr.substring(0, slashIndex));
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    public int getDay(String dateStr) {
        int slashIndex = dateStr.indexOf('/');
        if (slashIndex == -1 || slashIndex == dateStr.length() - 1) {
            return -1;
        }
        try {
            return Integer.parseInt(dateStr.substring(slashIndex + 1));
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    // Extract hour from 
    public int getHour(String timeStr) {
        int colonIndex = timeStr.indexOf(':');
        if (colonIndex == -1) {
            return -1;
        }
        try {
            return Integer.parseInt(timeStr.substring(0, colonIndex));
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    public int getMinute(String timeStr) {
        int colonIndex = timeStr.indexOf(':');
        if (colonIndex == -1 || colonIndex == timeStr.length() - 1) {
            return -1;
        }
        try {
            return Integer.parseInt(timeStr.substring(colonIndex + 1));
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}