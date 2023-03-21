package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7_CommissionOnSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Sales ID");
        String name = s.nextLine();
        System.out.println("Enter Seller's name ");
        String name1 = s.nextLine();
        System.out.println("Enter Sales amount");
        float amount = s.nextInt();
        System.out.println("Enter Salary basic");
        float amount1 = s.nextInt();
        s.close();
        float com;
        float gs;//gs = salary +com
        if (amount >= 50000) {
            com = amount1 +35/100;
            System.out.println("Commission is 35 % = " + com);
            System.out.println("Gross salary is = " + (amount1 + com));
        } else if (amount >= 30000 || amount <= 49999) {
            com = amount1 * 20 / 100;
            System.out.println("Commission is 20 % = " + com);
            System.out.println("Gross salary is = " + (amount1 + com));
        } else if (amount >= 20000 || amount <= 29999) {
            com = amount1 * 10 / 100;
            System.out.println("Commission is 10 %");
            System.out.println("Gross salary is = " + (amount1 + com));
        } else if (amount >= 10000 || amount <= 19999) {
            com = amount1 * 5 / 100;
            System.out.println("Commission is 5 %");
            System.out.println("Gross salary is = " + (amount1 + com));
        } else {
            com = amount1 * 2 / 100;
            System.out.println("Commission is 2 %");
            System.out.println("Gross salary is = " + (amount1 + com));
        }
    }
}
