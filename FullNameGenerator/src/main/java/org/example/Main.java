package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* String message= "Yikes";
        System.out.println(message);

        for (int i =0; i<message.length(); i++){
            System.out.println(message.charAt(i));
        }
        for (int i= message.length()-1; i>= 0; i--){
            System.out.println(message.charAt(i));
        }*/

        String first = getStringInput(scanner,"Enter your first name: ").trim();
        String last = getStringInput(scanner, "Enter your last name: ").trim();
        String middle = getStringInput(scanner, "Enter your middle name: ").trim();
        String title= getStringInput(scanner, "Enter your title: ").trim();



       middle =(middle.length()==1) ? middle + '.': middle;

        if (! title.isBlank()) {
           System.out.println(capitalizeLetter(first) + " " + capitalizeLetter(middle) + " " + capitalizeLetter(last) + ", " + capitalizeLetter(title));
        }else {
            System.out.println(capitalizeLetter(first) + " " + capitalizeLetter(middle) + " " + capitalizeLetter(last) );
        }
    }

    public static String getStringInput (Scanner scanner, String prompt){
        System.out.print(prompt);
        return scanner.nextLine();


    }
    public static String capitalizeLetter(String name){
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}
