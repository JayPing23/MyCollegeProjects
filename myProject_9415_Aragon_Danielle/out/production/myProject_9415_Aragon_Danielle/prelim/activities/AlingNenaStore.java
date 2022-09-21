/*
 *Author: Aragon, Danielle John P.
 * Programming Date: 09/17/2022
 * Class Code and Course Number: 9415A IT 112
    -----------------------------------------------------------------
    Input: Value of the products of AlingNenaStore
    Processes:Choose and show the product of AlingNenaStore
              Determine the amount of the Quantity of the product
              Show how much is the total of the product
              Display results
    Output: Compute the Total purchase Amount
            Minus the Discount
            Show the amount to be paid
            Show the Cash Tendered
            Show the Change
    ------------------------------------------------------------------
    Algorithm:
        1. Read the Product choosen by the Customer
        2. Specify the quantity of the product
        3. Calculate the Total Purchase amount
        4. Calculate the value of Discount
        5. Calculate the Amount to be Paid
        6. Compute the Change : Cash tendered - Amount to be Paid
        7. Show Results
    -------------------------------------------------------------------
 */
package prelim.activities;

import java.lang.*;
import java.util.*;

public class AlingNenaStore {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("--------------------------------------------------");
        String productName;
        // Input product Name
        System.out.print("Product: ");
        productName = kbd.nextLine();

        //Input the product quantity
        System.out.print("Quantity: ");
        // int quantity = kbd.nextInt();
        int quantity = Integer.parseInt(kbd.nextLine());

        // Input the product price
        System.out.print("Unit Price: ");
        //double price = kbd.nextDouble();
        double price = Double.parseDouble(kbd.nextLine());

        //input the discount
        System.out.print("Discount: ");
        double discount= Double.parseDouble(kbd.nextLine());
        double tempPrice = price * quantity;
        double totaldiscount = tempPrice * (discount / 100);

        // input the tendered Cash
        System.out.print("Cash Tendered: ");
        double cash = Double.parseDouble(kbd.nextLine());

        System.out.println("--------------------------------------------------");

        System.out.println("==================================================");
        //Display the Total Purchase Amount
        System.out.printf("\nTotal Purchase Amount: %.2f ", tempPrice);

        // Display the Total Discount
        System.out.printf("\nTotal Discount: %.2f", totaldiscount);

        // Display the Amount To be Paid
        double total = tempPrice - totaldiscount;
        System.out.printf("\nAmount To Be Paid: %.2f", total);

        // Display the Change
        double change = cash - total;
        System.out.printf("\nChange: %.2f", change);
        System.out.println("\n==================================================");

        System.exit(0);
    }
}

