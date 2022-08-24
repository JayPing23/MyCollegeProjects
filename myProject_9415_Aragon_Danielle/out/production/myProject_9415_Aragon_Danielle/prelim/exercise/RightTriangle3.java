/*
      * Author: Aragon, Danielle John P.
      * Programming Date: August 24, 2022
      * Activity Name and Number: Prelim Exercise Number 4.4
     Problem:
        Modify the program so that the values for the base and the height will be
        read from the keyboard at run time through the Scanner class. (i.e. The value of base and height will be entered
        when the program is executed.) Appropriate prompt messages (e.g. “Enter the base of the triangle:
        ” and “Enter the height of the triangle: ”) should be provided . Save the class as
        RightTriangle3.java. Provide the content of the comment pertaining to the details of this program at the
        beginning of the file (name, program info, problem, analysis, algorithm, etc.).

     IPO
        -----------------------------------------------------------------
        Input: Base and Height of the Right Triangle
        Processes: Compute the Hypotenuse of a Right Triangle
                    And Display results
        Output: Hypotenuse of the Right Triangle
        ------------------------------------------------------------------
        Algorithm:
        1. Read/Accept base and height of a Right Triangle
        2. Compute the Hypotenuse: hypotenuse = square root of (base + height)
        3. Compute the perimeter: base + height + hypotenus
        4. Compute the area Of RightTriangle: (1/2) * base * height
        5. Show the given base and height of the Right Triangle
        6. Show the computed hypotenuse of a right triangle with a given dimensions

        -------------------------------------------------------------------
      */
package Prelim.Exercises;

import java.lang.*;
import java.util.Scanner;


public class RightTriangle3 {
    public static void main (String[]args){

        Scanner kbd = new Scanner(System.in);

        System.out.println("Type the value of the base of the right triangle then press the enter key:");

        double base;
        base = Double.parseDouble(kbd.nextLine());

        System.out.println("Type the value of the height of the right triangle then press the enter key:");

        double height;
        height = Double.parseDouble(kbd.nextLine());

        double hypotenuse;
        hypotenuse = Math.sqrt  (Math.pow(base, 2) + Math.pow(height, 2));

        double perimeter;
        double areaOfRightTriangle;

        perimeter = base + height + hypotenuse;
        areaOfRightTriangle = 0.5 * base * height;

        System.out.println("The base and height of the Right Triangle is "+base+" and "+height+"");
        System.out.println("The Hypotenuse of the Right Triangle is "+hypotenuse+"");
        System.out.println(" The Perimeter of the Right Triangle is "+ perimeter +"");
        System.out.println(" The Area of the Right Triangle is is "+ areaOfRightTriangle+"");

    }
}