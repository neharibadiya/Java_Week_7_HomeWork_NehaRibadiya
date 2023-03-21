package javaprogramme;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int A = in.nextInt();
        if (A >= 20 && A <= 50){
            System.out.println("Number is positive");
        }else if (A >= 0 && A <=19){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
    }
}
