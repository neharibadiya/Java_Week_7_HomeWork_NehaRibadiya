package javaprogramme;

import java.util.Scanner;

/**
 *  Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12_AlphabetDigitSpecial {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = S.next().charAt(0);
        //nested if else syntax
        if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " This is Alphabet.");
        }else if(ch >= '0'){
            System.out.println(ch + " This is Number Digit.");
        }else{
            System.out.println(ch + " This is Special Character");
        }
    }
}
