package com.PRGA_01;
/*
 * TCSS 305
 * Instructor: Kivanc Dincer
 * Winter 2022
 * Programming Assignment #1
 */
import java.util.*;
/*
 * CalculatorDriver is a procedural program which functions as a basic
 * calculator
 *
 * @author Angelynna Pyeatt
 * @version January 12, 2022
 */

public class CalculatorDriver {

    /*
     * main method runs the program, taking in input from the user
     * to run the calculator program. Calling necessary methods to calculate
     * and display information
     *
     * @param String[] args - arguments
     */
    public static void main(String[] args) {

        displayInfo();
        boolean end = false;               //holds true when user decides
                                            //to end the program

        double numOne;                     //holds first num
        double numTwo;                     //holds second num
        double result = 0.0;
        String first = "", second = ""; //accepts nums as string from user
                                        //in order to account for clearing,
                                        //ending, or random number value

        String operator;                //holds operation (+, - , /, *)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        first = in.nextLine();
        //do while user has chosen not to end the program
        do {
            //checks if the user has decided to end the program
            if(first.equals("END")) {
                end = true;
            } else {
                //checks if user has decided to clear the operation
                if(checkClear(first)) {
                    first = "";
                } else { //if user has not chosen to end or clear,

                    System.out.println("Enter the operator:");
                    operator = in.nextLine();

                    System.out.println("Enter second number: ");
                    second = in.nextLine();

                    if(!checkClear(second)) { //if user has cleared
                        numOne = getNum(first, result);
                        numTwo = getNum(second, result);

                        //prints the line of operation:
                        System.out.println(numOne + " " + operator + " " + numTwo + "=");
                        result = doMath(numOne, numTwo, operator);
                        first = "RT";           //sets first to RT aka Running Total
                        numOne = result;        //sets numOne to result to account for RT
                    } else {                    //if user has not cleared,
                                                // prompt for a new first number
                        System.out.println("Enter first number:");
                        first = in.nextLine();
                    }

                }
            }

        } while (!end);
    }

    /*
     * displayInfo displays print statements with information
     * relevant to the user (clearAll option, random option,
     * ending the program)
     */
    public static void displayInfo() {
        System.out.println("Hello from CalculatorDriver");
        System.out.println("If ever you'd like to exit this program, type 'END' when inputting numbers");
        System.out.println("If you'd like to perform a new operation, type 'CLEAR' when inputting numbers");
        System.out.println("For random number: type 'RAND' in your line of operation when inputting numbers");
    }

    /*
     * checkClear checks if the user has chosen to clear the current
     * operation
     *
     * @param String s - String first or String second from main
     * @return boolean - true if user has chosen to clear, false otherwise
     */
    public static boolean checkClear(String s) {
        if(s.equals("CLEAR")) {
            return true;
        } else {
            return false;
        }
    }
    /*
     * getNum returns the double value for the current number
     *
     * @param String s - tring first or String second from main
     * @return double -a random if String is "RAND," the current
     *                  total if "RT," otherwise the method calls
     *                  the Double class to parse the string for
     *                  double values and returns the double value
     */
    public static double getNum(String s, double runningT) {
        if(s.equals("RAND")) {
            return getRandomNum();
        } else if (s.equals("RT")) {
            return runningT;
        } else {
            return Double.parseDouble(s);
        }
    }

    /*
     * generates a random double value
     *
     * @return r.nextDouble - double value between 0 and 1
     */
    public static double getRandomNum() {
        Random r = new Random();
        return r.nextDouble();
    }

    /*
     * Computes the operation and displays the answer,
     * if an invalid operation is given, prints "Invalid operation"
     *
     * @param double theFirst - first number
     * @param double theSecond - second number
     * @param char theOp - the operation character
     * @return double result - result of the function
     */
    public static double doMath(double theFirst, double theSecond, String theOp) {
        double result = 0.0;
        if(theOp.equals("+")) {                         //if addition
            System.out.println(theFirst + theSecond);
            result = theFirst + theSecond;
        } else if (theOp.equals("-")) {                 //if subtraction
            System.out.println(theFirst - theSecond);
            result = theFirst - theSecond;
        } else if (theOp.equals("*")) {                 //if multiplication
            System.out.println(theFirst * theSecond);
            result = theFirst * theSecond;
        } else if(theOp.equals("/")) {                  //if division
            System.out.println(theFirst / theSecond);
            result = theFirst / theSecond;
        } else {                                        //if no valid operation
            System.out.println("Invalid operation");
        }
        return result;
    }
}
