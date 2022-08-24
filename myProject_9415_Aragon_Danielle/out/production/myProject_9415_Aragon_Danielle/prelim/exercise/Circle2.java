/*
 *Author: Aragon, Danielle John P.
 * Programming Date: 8/24/2022
 * Prelim Exercise Number 3
    -----------------------------------------------------------------
    Input: area of a circle (area)
    Processes: Compute the circumference of the circle
               Compute the area of the circle Display results
    Output: radius
    ------------------------------------------------------------------
    Algorithm:
    1. Assign the area of the circle
    2. Compute the radius: radius = square root of (area/PI)
    3. Show the given area of a circle
    4. Show the computed radius of the circle with a given area

    -------------------------------------------------------------------
 */
package Prelim.Exercises;
import java.lang.*;
public class Circle2 {
    public static void main (String [] args) {
        double radius;  // double is the appropriate data type of radius because the
                        // value of radius may be a floating point number.
        double area;
        area = 100;   // Assigns 100 as the area of a circle
        radius = Math.sqrt(area / Math.PI) ; // computes the radius of the circle

                        // with a given area.
                        //Show data about the circle

        System.out.println(" ********************************************************");
        System.out.println(" * Given area of circle = " + area + "                  *");
        System.out.println(" * Computed radius of the circle = " + radius + "       *");
        System.out.println(" ********************************************************");
    }                   // end of the main method
}                       // end of Circle2 class
