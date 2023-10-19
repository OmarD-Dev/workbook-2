package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your full name: ");
        Scanner scanner = new Scanner(System.in);
        String FullName = scanner.nextLine();

        String firstName;
        String middleName;
        String lastName;

        String[] s = FullName.split(" ");
        firstName = s[0].trim();
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        if (s.length == 2) {
            middleName = "(none)";
            lastName = s[1].trim();
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        } else {

            middleName = s[1].trim();
            middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1);
            lastName = s[2].trim();
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        }

        System.out.println("First name is: " + firstName + "\nMiddle name is: " + middleName + "\nLast name is: " + lastName);
    }
}
