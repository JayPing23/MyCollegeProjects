/*
      * Author: Aragon, Danielle John P.
      * Programming Date: August 24, 2022
      * Activity Name and Number: Prelim Exercise Number 4.2
     Problem:
        Modify the program so that the values for the length and the width will be read
        from the keyboard at run time through the Scanner class (i.e. The values of length and width will be entered
        when the program is executed). Appropriate prompt messages (e.g. “Enter the length of the
        rectangle: ” and “Enter the width of the rectangle: ”) should be provided. Provide the content
        of the comment pertaining to the details of this program at the beginning of the file (name, program info,
        problem, analysis, algorithm, etc.).
     IPO
      Input: lenght and width of a rectangle
      Process:
        Read the lenght and width of a rectangle
        Compute the perimeter of a rectangle
        Compute the area of a rectangle
        Display Results
      Output: perimeter, areaOfRectangle

    Algorithm:
        1. Read/Accept the length and width of the rectangle
        2. Compute the perimeter : perimeter = 2*length + 2*width;
        3. Compute the area: area = length*width
        4. Show the length and width of the rectangle
        5. Show the perimeter of the rectangle
        6. Show the area of the rectangle
 */


package Prelim.Exercises;

import java.lang.*;
import java.util.Scanner;

public class Rectangle3 {
    public static void main(String[] args){

        Scanner kbd = new Scanner(System.in);
        System.out.print("Type the value of length then press the enter key:");

        int length;
        length = Integer.parseInt(kbd.nextLine());
        System.out.print("Type the value of width then press the enter key:");

        int width;
        width = Integer.parseInt(kbd.nextLine());

        int perimeterOfTheRectangle =(2 * length) + (2 * width);
        int areaOfTheRectangle = length * width;


        System.out.println(" The width and length is "+ length+" and "+width+"");
        System.out.println(" The Perimeter of the Rectangle is "+ perimeterOfTheRectangle +"");
        System.out.println(" The Area of the Rectangle is is "+ areaOfTheRectangle+"");
    }
}