package javaprogramme;

import java.util.Scanner;

/**
 *  Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8_NameAccordingly {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter alphabet \"A to F\" ");
        String city = s.next();
        s.close();

        if(city == "A") {
            System.out.println("India");
        } else if (city == "B") {
            System.out.println("London");
        } else if (city == "C") {
            System.out.println("Bristol");
        } else if (city == "D") {
            System.out.println("Birmingham");
        } else if (city == "E") {
            System.out.println("Glasglow");
        } else if (city == "F") {
            System.out.println("Bath");
        } else {
            System.out.println("Envalid city name");
        }
    }
}