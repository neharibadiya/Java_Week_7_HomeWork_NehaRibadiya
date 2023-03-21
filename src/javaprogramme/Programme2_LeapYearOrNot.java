package javaprogramme;

import java.util.Scanner;

/**
 *  Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme2_LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the year: ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;//dived by 4 is leap year
        boolean y = (year % 100) !=0;//dived by 100 is not leap year
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year +" is not a leap year");
        }
    }
}
