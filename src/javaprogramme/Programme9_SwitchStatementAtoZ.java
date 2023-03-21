package javaprogramme;

import java.util.Scanner;

/**
 * input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * (also using switch statement.)
 */
public class Programme9_SwitchStatementAtoZ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F");
        String city = s.next();
        s.close();

        switch (city){
            case "A" :
                System.out.println("This city is India");
                break;
            case "B":
                System.out.println("This city is London");
                break;
            case "C":
                System.out.println("This city is Bristol");
                break;
            case "D" :
                System.out.println("This city is Birmingham");
                break;
            case "E" :
                System.out.println("This city is Glasglow");
                break;
            case "F":
                System.out.println("This city is Bath");
                break;
            default:          //for another alphabet
                System.out.println("This is Invalid city name");
        }
    }
}
