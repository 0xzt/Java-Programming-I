/**************************************************************************************
* Program:     PRG/420 Week 3
* Purpose:     Week 3 Coding Assignment
* Programmer:  Zachary Taylor
* Class:       PRG/420
* Creation Date:  6/21/2019
******************************************************************************************
* Program Summary:   For, while, and do-while loops; nested loops
*
* For this assignment, you will add code to create:
*
* a for loop nested inside another for loop
* a while loop
* a do-while loop

*****************************************************************************************/

package prg420week3_codingassignment;

public class PRG420Week3_CodingAssignment {
    public static void main(String[] args) {

        // The following code should print asterisks: 1 on line 1, 2 asterists on line
        // 2,
        // 3 on line 3, 4 on line 4... for as many lines as the variable
        // linesOfAsterisks.
        // To do this, we can use 2 nested for loops. The first for loop is coded for
        // you.
        // You will need to add another for lop, NESTED INSIDE the first, that prints
        // a certain # of asterisks based on the # of times the loop code has been
        // executed.
        // The result should look like this:
        // *
        // **
        // ***
        // ****
        // *****
        // etc.
        int linesOfAsterisks = 5;
        for (int i = 1; i <= linesOfAsterisks; i++) { // for each line...
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //////////////////////////////////////////////////////////////////////
        // Add a while or do-while loop that displays the numbers from 10 to 1 in that
        ////////////////////////////////////////////////////////////////////// order,
        ////////////////////////////////////////////////////////////////////// like so:
        // 10
        // 9
        // 8
        // 7
        // ...
        // 1
        //////////////////////////////////////////////////////////////////////

        int num = 10;

        do {
            System.out.println(num);
            num--;
        } while (num > 0);

        ///////////////////////////////////////////////////////////////////////
        // Write a loop that adds 7s one at a time until the sum becomes > 157.
        // Then print out both the sum and the number of 7s that were added.
        // Write a while or do-while loop, whichever you think is most appropriate.
        //////////////////////////////////////////////////////////////////////////

        int sum = 0;
        int numberOfSevens = 0;

        // LINE 3. ADD ANOTHER LOOP THAT ADDS 7s UNTIL SUM > 157. THEN DISPLAY SUM AND
        // NUMBER OF SEVENS ADDED.
        while (sum <= 157) {
            sum = sum + 7;
            numberOfSevens = numberOfSevens + 1;
        }
        System.out.println(
                "The current sum of 7\'s is " + sum + " the number of 7\'s that were added is " + numberOfSevens + ".");

    }
}