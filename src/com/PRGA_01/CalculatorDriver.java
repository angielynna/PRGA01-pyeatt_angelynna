package com.PRGA_01;

import java.io.*;
import java.util.*;

public class CalculatorDriver {

    public static void main(String[] args) {
        /*
        operations: +-* division
        Specifics: Rand, clearAll, positive/negative
        Constraints: 10-digit limit, display only 10 digits
        ^^ format
        Decimals are allowed
         */
        String operation; //just in case
        System.out.println("Hello from CalculatorDriver!");
        System.out.println("If ever you'd like to exit this program, type 'END'");
        System.out.println("For random number: type 'RAND' in your line of operation");
        String input;
        int outputInt = 0;
        double outputDouble = 0.0;
        //begin a stupid loop
        //changes: check through the input for RAND and then calculate
        //change calculateInt() to calculate and figure it out bitch
        //new branch: preRandLoop
        do {
            System.out.println("Type in your line of operation: ");
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            if(input == "RAND") {
                double r = generateRandom();

                //add r to operation
                //ask for the operation and if another random value needs to be assigned
            } else { //calculateInt
                outputInt = calculateInt(input);
            }
        } while(!(input.equals("END")));
    }
    //for ints?
    public static int calculateInt(String theInput){
        int length = theInput.length();
        int sign = 1;           //holds the sign of the integer
        int result = 0;
        int n = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < length; i++) {
            if(Character.isDigit(theInput.charAt(i))){
                n = theInput.charAt(i) - '0';
                while((i + 1 < length) && (Character.isDigit(theInput.charAt(i + 1)))) {
                    n = n * 10 + theInput.charAt(i + 1) - '0';
                    i++;
                }
                result += n * sign;
            } else if (theInput.charAt(i) == '+'){ //addition
                result += sign * n;
                n = 0;
                sign = 1;
            } else if (theInput.charAt(i) == '-'){ //subtraction
                result += sign * n;
                n = 0;
                sign = -1;
            } else if (theInput.charAt(i) == '*'){ //multiplication
                stack.push(result);
                stack.push(sign);

                sign = 1;
                result += sign * n;
                n = 0;
                result *= stack.pop();
                result += stack.pop();
            } else { //division
                stack.push(result);
                stack.push(sign);

                sign = 1;
                result += sign * n;
                n = 0;
                result = result / stack.pop();
                result += stack.pop();
            }
        }
        if(n != 0) { //making sure we account for the sign
            result += sign * n;
        }
        return result;
    }



    public static double generateRandom() {
        Random rand = new Random();
        return rand.nextDouble();
    }
}
