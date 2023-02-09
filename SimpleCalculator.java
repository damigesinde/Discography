/*

  Name: Dami Gesinde
  Date: February 9, 2023
  Purpose of Program: This program was made for no reason other than boredom. It was a simple program to write and took less than 30 minutes.

*/

import java.util.Scanner;

class SimpleCalculator 
{
  public static void main(String[] args) 
  {

    Scanner input = new Scanner(System.in); 

    // Initianes the answer variable
    double answer = 0;
    

    // Introduces the user to the program
    System.out.println(" ");
    System.out.println("Welcome, this program is a Simple Calculator, it calculates two number inputs.");
    System.out.println(" ");
    

    // Gives instructions on how to input calculation type and takes it stores it in a variable
    System.out.println("Input the number correspondent to the process you'd like to initiate: \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
    double type = input.nextDouble();
    System.out.println("  ");
    

    // Asks for the two numbers that need to be calculated and takes it in a variable
    System.out.println("Enter the first number of the equation: ");
    double number1 = input.nextDouble();

    System.out.println("Enter the second number of the equation: ");
    double number2 = input.nextDouble();

    
    // Calculates the inputed numbers correspondent to the inputed calculation type  
    if (type == 1)
    {
      answer = number1 + number2;
    }
    else if (type == 2)
    {
      answer = number1 - number2;
    }
    else if (type == 3)
    {
      answer = number1 * number2;
    }  
    else if (type == 4)
    {
      answer = number1 / number2;
    }

    
    // Prints the answer  
    System.out.println(answer);
    
  
  }
}
   