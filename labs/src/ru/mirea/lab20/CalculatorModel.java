package ru.mirea.lab20;

import java.util.EmptyStackException;
import java.util.Stack;

// Model
public class CalculatorModel {

    // The stack who will contain the numbers the calculator is working on.
    private Stack<Double> stack = new Stack<>();
    private String currentDisplay = "0";
    // This variable signal if the displayed number is already in the stack
    private boolean isDisplayEnter = false;

    /***
     * Print the current stack status in the terminal.
     * Useful for debug.
     */
    private void printStack(){
        System.out.println("======STACK======");
        for(Double d: stack){
            System.out.println("> " + d);
        }
        System.out.println();
    }

    /***
     * This method do the user's operation to the last numbers in the stack.
     * @param o The method to perform, using functional interface Operator.
     */
    public void doOperation(String o){
        if(!isDisplayEnter)
            enter();

        try {
            double result = .0;
            double operand2 = stack.pop();
            double operand1 = stack.pop();
            switch (o) {
                case "+" -> result = operand1 + operand2;
                case "-" -> result = operand1 - operand2;
                case "*" -> result = operand1 * operand2;
                case "/" -> result = operand1 / operand2;
            }
            currentDisplay = Double.toString(result);
            stack.push(result); // The result is entered in the stack to allow direct operation on it
        }
        catch (EmptyStackException e){
            //e.printStackTrace();
            currentDisplay = "STACK ERROR";
            isDisplayEnter = true; // To avoid operation on the String "STACK ERROR".
        }

    }

    /***
     * Take the current display number and add it in the stack.
     */
    public void enter(){
        if(!isDisplayEnter)
            stack.push(Double.valueOf(currentDisplay));
        isDisplayEnter = true;
        currentDisplay = "0";
        //printStack(); // Debug
    }

    /***
     * Add a digit at the current display number.
     * @param n The digit to add.
     */
    public void addDigit(String n){
        if(!isDisplayEnter && !currentDisplay.equals("0"))
            currentDisplay += n;
        else // If the current display number isn't significant or an old number
            currentDisplay = n;

        isDisplayEnter = false; // The new number formed isn't in the stack.
    }

    /***
     * Return the number who should be display on the screen.
     * @return The string of the number.
     */
    public String getCurrentDisplay(){
        return currentDisplay;
    }

    public void clear(){
        stack.clear();
        currentDisplay = "0";
    }
}
