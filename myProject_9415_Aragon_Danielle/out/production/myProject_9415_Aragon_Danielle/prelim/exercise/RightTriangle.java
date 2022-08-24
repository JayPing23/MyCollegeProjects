/*
 * Author: Aragon, Danielle John P.
 * Programming Date: 8/23/2022
 * Prelim Exercise Number 2.4

 */
package Prelim.Exercises;
import java.lang.*;
public class RightTriangle {

        public static void main(String[] args)  {

            int base = 5, height = 5, hypotenus =10;
            double perimeter, areaOfRightTriangle;

            perimeter = base + height + hypotenus;
            areaOfRightTriangle = (1/2) * base * height;

            // Show some outputs on the screen

            System.out.println(" **********************************************************");
            System.out.println(" *                                                        *");
            System.out.println(" *                                                        *");
            System.out.println(" *    Base of the Right Triangle " + base +"              *");
            System.out.println(" *    Height of the Right Triangle " + height +"          *");
            System.out.println(" *    Hypotenuse of the Right Triangle " + hypotenus +"   *");
            System.out.println(" *    Perimeter of the Right Triangle " + perimeter + "   *");
            System.out.println(" *    Area of Right Triangle is " + areaOfRightTriangle +"*");
            System.out.println(" *                                                        *");
            System.out.println(" *                                                        *");
            System.out.println(" **********************************************************");

        } // end of main method
    } // end of class

