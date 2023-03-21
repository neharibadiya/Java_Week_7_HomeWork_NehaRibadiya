package javaprogramme;

import java.util.Scanner;

/**
 *1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class Programme1_NumberOddOrEven {
    public static void main(String[] args) {
        //take input from users
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        //ternary operator check number is odd or even

        String result = (num1 % 2 == 1) ? "input number is odd" : "input number is even";

        System.out.println(num1 +" "+ result);
        input.close();
    }
}
