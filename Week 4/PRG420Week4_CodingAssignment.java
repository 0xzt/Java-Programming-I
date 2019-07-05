/**********************************************************************
* Program:  PRG/420 Week 4 
* Purpose:     Week 4 Coding Assignment
* Programmer:  Zachary Taylor      
*  Class:       PRG/420       
*  Creation Date:  6/27/19
*********************************************************************
*
**********************************************************************
*  Program Summary: This program demonstrates these basic Java concepts:
*     - Creating an array based on user input
*     - Accessing and displaying elements of the array
* 
* The program should declare an array to hold 10 integers.
* The program should then ask the user for an integer.
* The program should populate the array by assigning the user-input integer
* to the first element of the array, the value of the first element + 100 to
* the second element of the array, the value of the second element + 100 to
* the third element of the array, the value of third element + 100 to
* the fourth element of the array, and so on until all 10 elements of the
* array are populated.
* 
* Then the program should display the values of each of the array
* elements onscreen. For example, if the user inputs 4, the output
* should look like this:
* 
* Enter an integer and hit Return: 4
* Element at index 0: 4
* Element at index 1: 104
* Element at index 2: 204
* Element at index 3: 304
* Element at index 4: 404
* Element at index 5: 504
* Element at index 6: 604
* Element at index 7: 704
* Element at index 8: 804
* Element at index 9: 904
***********************************************************************/
package prg420week4_codingassignment;

// We need to import the following library if we want to use the
// Scanner class to get user input.
import java.util.Scanner;

public class PRG420Week4_CodingAssignment {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[10];

        Scanner myInputScannerInstance = new Scanner(System.in);
        System.out.print("Enter an integer and hit Return: ");

        int myFirstArrayElement = Integer.parseInt(myInputScannerInstance.next());
        myArray[0] = myFirstArrayElement;

        for (int i = 1; i < myArray.length; i++) {
            myArray[i] = myArray[i - 1] + 100;
        }

        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Element at index " + j + ": " + myArray[j]);
        }
    }
}