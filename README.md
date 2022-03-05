# PRGA01-pyeatt_angelynna
Programming Assignment #1 TCSS305
Assignment Description:
1. You have probably given programming assignments with a complete list of requirements as well as a template design in your previous programming courses. In this assignment, you will ANALYZE a given program first and then DESIGN and IMPLEMENT a similar Java program to the original one.
2. The problem is to provide a single Java program with a command-line interface (CLI) that mimics the behavior of the following web-based calculator program closely:
In other words, your program should support the same functions, accept the input values with the same value ranges, print the results of operations in mostly the same way except the simplifications given in 3, 4, and 5 below.
3. For simplicity, your calculator should be able to do calculations up to 10 digits, i.e., it should work for all input values that would give a calculation result up to 9,999,999,999. You don’t need to support or test the numbers larger than that value.
4. For simplicity, your calculator does NOT need to handle invalid inputs or do any error checking. Instead, it should guide the user with appropriate prompts about the expected inputs and allowed input formats/values so that the user inputs will not cause the program to crash or err.
You can safely assume that the user will follow the displayed prompts and enter completely valid inputs.
5. For simplicity, you are NOT expected to implement a GUI (Graphical User Interface) for your program, but a
command-line interface (CLI.) You can do your own CLI design freely.
Hint: Any CLI that allows the user to enter or select the calculator type, operation to be performed, and enter the input values, display the output results to the user as text on the console is acceptable. Both implementations should be provided with the same user interface.
 
 
https:// www.calculator.net/math-calculator.html
*Some of the functionality of the calculator (i.e., greyed out ones) was removed to simplify the assignment.
 
6. You first need to ANALYZE the PROBLEM and specify the REQUIREMENTS for your Java program.
Hint 1: The document that lists what your program is going to do and how it is going to behave is called the target program’s requirements specification. You may think of the requirements specification as equivalent to the set of detailed instructions typically provided to you readily in the programming assignments in many courses, such as TCSS 142 and 143. Any programmer starting with this list/map should be able to develop a similar program at the end.
Hint 2: As an example, the following are an example of very high-level requirements specification of your target calculator program for your own use:
• The calculator should READ a set of inputs from the user, PERFORM some OPERATIONS, and WRITE the results to the console in some specific format.
• The calculator should calculate the result of a set of input values separated by arithmetic operators and display the result of the calculation.
• The calculator can operate on positive and negative integer numbers and on floating-point numbers. •...
Please continue to work on the requirement specification with your group members to make it more specific and clearer; that will make your implementation easier.
Hint 3: You can list or create a mind map to list all the operations performed by each calculator WITH their valid and invalid set of INPUTS, the details of the PROCESSING (calculation) performed, and type of OUTPUTS (i.e., results) displayed to the user in response to different inputs.
