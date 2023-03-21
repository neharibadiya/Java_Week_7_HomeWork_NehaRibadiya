package javaprogramme;

import java.util.Scanner;

/**
 *  Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * ________________________________
 * |                              |
 * | Mark Sheet                   |
 * |______________________________|
 * | Name       : Jay             |
 * | Roll No    : 08              |
 * |______________________________|
 * | Subjects   : Marks           |
 * |______________________________|
 * | Math       : 98              |
 * | Science    : 90              |
 * | English    : 85              |
 * |______________________________|
 * | Total      : 273             |
 * |______________________________|
 * | Percentage : 91.0            |
 * | Result     : Pass            |
 * | Grade      : A+              |
 * |______________________________|
 */
public class Programme3_Result {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = s.nextLine();
        System.out.println("Enter Your Roll No");
        int rollno = s.nextInt();
        System.out.println("Enter Marks of Math");
        int mark = s.nextInt();
        System.out.println("Enter Marks of Science");
        int mark1 = s.nextInt();
        System.out.println("Enter Marks of English");
        int mark2 = s.nextInt();
        s.close();
        System.out.println(" ________________________________________");
        System.out.println("|               Mark Sheet               |");
        System.out.println("|                                        |");
        System.out.println("|________________________________________|");
        System.out.println("|       Name     :    " +name+"               |");
        System.out.println("|       Roll No  :    " +rollno+"                 |");
        System.out.println("|________________________________________|");
        System.out.println("|       Subjects :    Marks              |");
        System.out.println("|________________________________________|");
        System.out.println("|       Math     :    "+mark+"                 |");
        System.out.println("|       Science  :    "+mark1+"                 |");
        System.out.println("|       English  :    "+mark2+"                 |");
        System.out.println("|________________________________________|");
        int total = mark +mark1 +mark2;
        System.out.println("|       Total    :      "+total+"              |");
        System.out.println("|________________________________________|");
        float perc = total/3;
        System.out.println("|      Percentage:      "+perc+"             |");
        if (perc <35 || mark <35 || mark1 <35 || mark2 <35) {
            System.out.println("|      Result    :      fail               |");
        }else{
            System.out.println("|      Result    :      pass             |");
        }
        if (perc >=80) {
            System.out.println("|      Grade     :      A+                |");
        }else if (perc >=60 && perc <80){
            System.out.println("|      Grade     :      A                |");
        }else if (perc >=50 && perc <60) {
            System.out.println("|      Grade     :      B                |");
        }else if (perc >=35 && perc <50) {
            System.out.println("|      Grade     :      C                |");
        }else {
            System.out.println("|      Grade     :      D                |");
        }
        System.out.println("|________________________________________|");
    }
    }

