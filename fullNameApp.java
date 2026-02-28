// fullNameApp.java
// Grant Dresser
// 2/27/2025

import java.util.Scanner;

public class fullNameApp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // ask user for first/mid/last name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        // combine names into a full name
        String fullName = firstName + " " + middleName + " " + lastName;

        // print full name
    
        System.out.println("Your full name is: " + fullName);

        input.close();
    }
}