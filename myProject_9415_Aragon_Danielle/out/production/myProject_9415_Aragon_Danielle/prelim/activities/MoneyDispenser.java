/*
 *Author: Aragon, Danielle John P.
 * Programming Date: 09/17/2022
 * Class Code and Course Number: 9415A IT 112
    -----------------------------------------------------------------
    Input: Value of the money to be withdrawn
    Processes:Determine the amount that about ot be dispense
              Read the amount of money that will be withdrawn from an ATM (e.g. P500 or P1200)
              Compute and output the least number of peso bills
              (P100 peso bills, P500 peso bills, P1000 peso bills)
              Determine also the amount of money corresponding to each peso bill dispensed.
              the sum total of number of bills dispensed.
              Display results
    Output: Compute and output the least number of peso bills
            P100 peso bills, P500 peso bills, P1000 peso bills
            Show the amount of money corresponding to each peso bill dispensed
            Show the total of number of bills dispensed.
    ------------------------------------------------------------------
    Algorithm:
        1. Determine the amount that about ot be dispense
        2. Read the amount of money that will be withdrawn from an ATM (e.g. P500 or P1200)
        3. Compute and output the least number of peso bills
           (P100 peso bills, P500 peso bills, P1000 peso bills)
        4. Determine also the amount of money corresponding to each peso bill dispensed.
        5. Show the amount of money corresponding to each peso bill dispensed
        6. Show the total of number of bills dispensed.
        7. Show Results
    -------------------------------------------------------------------
 */
package prelim.activities;
import java.lang.*;
import java.util.*;

public class MoneyDispenser {
    public static void main(String[] args) {
        //Scanner Input
        Scanner kbd = new Scanner(System.in);

        //User Peso Bill input
        System.out.print("Enter amount to be withdrawn, whole numbers only: ");
        int money = Integer.parseInt(kbd.nextLine());

        //Quantity Dispensed for 1000
        int onet = money / 1000;
        money = money % 1000;
        //Quantity Dispensed for 500
        int fiveh = money / 500;
        money = money % 500;
        //Quantity Dispensed for 100
        int oneh = money / 100;
        money = money % 100;

        //Total Bill Amount
        double oneta = onet * 1000;
        double fiveha = fiveh * 500;
        double oneha =  oneh * 100;

        //Total of No. Of Bills
        int totalqd = onet + fiveh + oneh;
        double totala = oneta + fiveha + oneha;

        //Show the Results
        System.out.printf("%s%18s%18s%n","PESO BILLS", "QUANTITY" ,"AMOUNT");
        System.out.println("=======================================================");
        System.out.printf("%s%19d%23.2f%n","P1000", onet, oneta);
        System.out.printf("%s%20d%23.2f%n","P500", fiveh, fiveha);
        System.out.printf("%s%20d%23.2f%n","P100", oneh, oneha);
        System.out.println("-------------------------------------------------------");
        System.out.printf("%s%6d%23.2f%n","Total No. of Bills", totalqd, totala);


    }
}
