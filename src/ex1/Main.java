package ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    // Convert short date to full date
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ISO_LOCAL_DATE);
        int year = date.getYear();
        int day = date.getDayOfMonth();

        String monthName = date.getMonth().toString();
        monthName = monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();
        System.out.println("Full date Representation: " + monthName + " " + day + ", " + year);
        scanner.close();
    }
}
