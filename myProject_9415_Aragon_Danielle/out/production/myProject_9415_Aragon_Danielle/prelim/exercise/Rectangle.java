/*
 * Author: Aragon, Danielle John P.
 * Programming Date: 8/22/2022
 * Prelim Exercise Number 2.2

 */
package Prelim.Exercises;
import java.lang.*;
public class Rectangle {
    public static void main(String[] args)  {

        int lenght = 10, width = 5;
        double perimeter, areaOfRectangle;

        perimeter = (2 * lenght) + (2 * width);
        areaOfRectangle = lenght * width;

        // Show some outputs on the screen

        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *      Lenght of the Rectangle " + lenght +"             *");
        System.out.println(" *      Width of the Rectangle " + width +"               *");
        System.out.println(" *      Perimeter of the Rectangle " + perimeter + "      *");
        System.out.println(" *      Area of Rectangle is " + areaOfRectangle + "      *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");

    } // end of main method
} // end of class