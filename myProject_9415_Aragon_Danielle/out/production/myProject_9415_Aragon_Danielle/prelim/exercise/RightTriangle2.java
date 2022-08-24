    /*
        *Author: Aragon, Danielle John P.
        * Programming Date: 8/24/2022
        * Prelim Exercise Number 3.2
        -----------------------------------------------------------------
        Input: Base and Height of the Right Triangle
        Processes: Compute the Hypotenuse of a Right Triangle
                    And Display results
        Output: Hypotenuse of the Right Triangle
        ------------------------------------------------------------------
        Algorithm:
        1. Assign the base and height of a Right Triangle
        2. Compute the hypotenuse: hypotenuse = square root of (base + height)
        3. Show the given base and height of the Right Triangle
        4. Show the computed hypotenuse of a right triangle with a given dimensions

        -------------------------------------------------------------------
      */
package Prelim.Exercises;
import java.lang.*;
public class RightTriangle2 {
    public static void main(String[] args) {
        double base = 15, height = 12;    // double is the appropriate data type of base and height because the
                                          // value of base and height may be a floating point number.
        double hypotenuse;
        hypotenuse = Math.sqrt  (Math.pow(base, 2) + Math.pow(height, 2));
        //Display Results
        System.out.println("The base and height of the Right Triangle is "+base+" and "+height+"");
        System.out.println("The Hypotenuse of the Right Triangle is "+hypotenuse+"");
        System.exit(0);
    }       // end of the main method
}
