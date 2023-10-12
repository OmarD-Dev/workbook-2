package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message= "Yikes";
        System.out.println(message);

        for (int i =0; i<message.length(); i++){
            System.out.println(message.charAt(i));
        }
        for (int i= message.length()-1; i>= 0; i--){
            System.out.println(message.charAt(i));
        }

        String first = getStringInput(scanner,"Enter your first name: ");
        String last = getStringInput(scanner, "Enter youjr first name");
        String middle = getStringInput(scanner, "Enter your middle name");
        String title= getStringInput(scanner, "Enter your title");

        System.out.println(first + middle + last + title);

        if (middle.length()==1 ) middle= middle + ".";
        if (! title.isEmpty() ) title = ", " + title;

        System.out.println(first + " " + middle + " "+ last + title);
    }

    public static String getStringInput (Scanner scanner, String prompt){
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;

    }
}
