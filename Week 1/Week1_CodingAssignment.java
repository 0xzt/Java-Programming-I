/**********************************************************************
*	Program:	 PRG420Week1_CodingAssignment	
* 	Purpose: 	 Week 1 Individual Assignment #2	
*	Programmer:	 Zachary Taylor		
*	Class:		 PRG/420			
*	Creation Date:	 6/8/2019
*********************************************************************
*
**********************************************************************
*	Program Summary: This program asks the user for a one-word name
*                        and then displays a constructed greeting
*                        that looks like this: 
*
*                        Hello, NAME!
**********************************************************************/

package prg420week1_codingassignment;

import java.util.Scanner;

public class PRG420Week1_CodingAssignment {

    public static void main(String[] args) {
        // Create a usable instance of an input device
        Scanner myScanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Please enter your first name.");

        // Capture first word and assign it to A VARIABLE
        String name = myScanner.next();

        // Construct the greeting
        System.out.println("Hello, " + name + "!");

    }

}
