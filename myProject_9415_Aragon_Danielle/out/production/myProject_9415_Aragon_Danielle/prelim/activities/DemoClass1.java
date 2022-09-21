/*
 * Author: Aragon, Danielle John P.
 * Programming Date: 09/19/2022
 * Class Code and Course Number: 9415A IT 112
 */
/*
 * Create a program that uses the for statement to computes the value of
 * base raised to exponent
 * where base and exponent are whole numbers that are
 * entered at program runtime

 INPUT: base, exponent
 OUTPUT: value of base raised to exponent

 ALGORITHM:
 1. Declare variables for base, exponent and valueOfPower
 2. Prompt the program user to enter the value of base
 3. Let the computer accept the value of base
 4. Prompt the program user to enter the value of exponent
 5. Let the computer accept the value of exponent
 6. Initialize valueOfPower to 1;
 7. for ( x= 1 to exponent )
    let valueOfPower = valueOfPower*base
 8. Show the value of power
 *
 */
package Prelim.activities;

import java.util.Scanner;
import java.lang.*;

public class DemoClass1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will compute the value of base raised to exponent. ");
        System.out.println("  where exponent is a small integer. ");
        System.out.println("You will be asked to enter the value of base and the exponent");
        int base=0;
        int exponent = 0;
        int valueOfPower = 0;

        System.out.print("Enter the value of base: ");
        base = Integer.parseInt(keyboard.nextLine());

        System.out.print("Enter the value of exponent which must be a small integer: ");
        exponent = Integer.parseInt(keyboard.nextLine());

        valueOfPower = 1;
        for (int x = 1; x<=exponent; x=x+1){
            valueOfPower = valueOfPower * base;
        }

        System.out.println("The value of "+ base + " raised to "+ exponent + " is " + valueOfPower + ".");

        System.exit(0);
    }
}
