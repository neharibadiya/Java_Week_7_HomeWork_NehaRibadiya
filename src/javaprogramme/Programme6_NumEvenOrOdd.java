package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6_NumEvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = s.nextInt();
        s.close();

        if (num % 5== 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}

