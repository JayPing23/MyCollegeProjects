/*
      * Author: Aragon, Danielle John P.
      * Programming Date: August 24, 2022
      * Activity Name and Number: Prelim Exercise Number 4.3
     Problem:
        Modify the program so that the measurement of the side of the square will be read from the keyboard
        at run time through the Scanner class. (i.e. The value of side will be entered when the program is executed.) An
        appropriate prompt message (e.g. “Please enter the measure of a side of the square:”) should
        be provided. Provide the content of the comment pertaining to the details of this program at the beginning of the
        file (name, program info, problem, analysis, algorithm, etc.).
     IPO
      Input: side of the square
      Process:
        Read the side of a square
        Compute the perimeter of a square
        Compute the area of a square
        Display Results
      Output: perimeter, areaOfSquare

    Algorithm:
        1. Read/Accept the side of a square
        2. Compute the perimeter : perimeter = (2 * side)
        3. Compute the area: area = Math.pow(side, 2)
        4. Show the side of a square
        5. Show the perimeter of the square
        6. Show the area of the square
 */
package Prelim.Exercises;

import java.lang.*;
import java.util.Scanner;

public class Square3 {
    public static void main(String[] args){

        Scanner kbd = new Scanner(System.in);

        System.out.print("Type the measurement of the side of the square then press the enter key:");

        int sideOfSquare;
        sideOfSquare = Integer.parseInt(kbd.nextLine());

        double perimeter;
        double areaOfSquare;

        perimeter = sideOfSquare * 4;
        areaOfSquare = sideOfSquare * sideOfSquare;

        System.out.println(" The measurement of one side of a square is  "+ sideOfSquare+"");
        System.out.println(" The Perimeter of the Square is "+ perimeter +"");
        System.out.println(" The Area of the Square is is "+ areaOfSquare+"");


    }
}