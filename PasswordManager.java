/*

  Name: Dami Gesinde
  Date: February 2, 2023
  Purpose of Program: This program was made during my second semester of AP Computer Science A to test my Java proficiency. Unfortunately, the program does not store the information but only takes the input. It is planned, like all other programs, to be improved in the future.

*/


import java.util.Scanner;
import java.util.Arrays;

class PasswordManager 
{
  public static void main(String[] args) 
  {
    
    Scanner input = new Scanner(System.in); 

    /*
      Introduction to the program
    */
    System.out.println(" ");
    System.out.println("Hi, this program is a Password Manager.");
    System.out.println(" ");
    System.out.println("Simply answer some questions and your password, username, and other information will be stored securly in the database!");
    System.out.println(" ");


    // Makes an arry that will store the data
    String [] passOne = new String[8];


    /*
      Asks for the name of the website/app and stores it in the array
    */
        System.out.println("What is the name of the website/app's login information you would like to store?  ");
        String typeAnswer = input.nextLine();

        passOne [0] = typeAnswer;
        System.out.println(" ");


    /*
      Asks for the name inputed in the website/app and stores it in the array
    */
        System.out.println("What name did you input on the website/app?");
        String nameAnswer = input.nextLine();

        passOne [1] = nameAnswer;
        System.out.println(" ");
        

    /*
      Asks for the email inputed in the website/app and stores it in the array
    */
        System.out.println("What email did you input on the website/app?");
        String emailAnswer = input.nextLine();

        passOne [2] = emailAnswer;
        System.out.println(" ");
        

    /*
      Asks for the phone number inputed in the website/app and stores it in the array
    */
        System.out.println("What phone number did you input on the website/app?");
        String phoneNumberAnswer = input.nextLine();

        passOne [3] = phoneNumberAnswer;
        System.out.println(" ");
        

    /*
      Asks for the adress inputed in the website/app and stores it in the array
    */
        System.out.println("What adress did you input on the website/app?");
        String adressAnswer = input.nextLine();

        passOne [4] = adressAnswer;
        System.out.println(" ");


    /*
      Asks for the username inputed in the website/app and stores it in the array
    */
        System.out.println("What username did you input on the website/app?");
        String usernameAnswer = input.nextLine();

        passOne [5] = usernameAnswer;
        System.out.println(" ");
        

    /*
      Asks for the password inputed in the website/app and stores it in the array
    */
        System.out.println("What password did you input on the website/app?");
        String passwordAnswer = input.nextLine(); 

        passOne [6] = passwordAnswer;
        System.out.println(" ");
        

    /*
      Asks for any extra information the user would like to store and stores it in the array
    */
        System.out.println("What extra information would you like to note?");
        String extraInformationAnswer = input.nextLine();

        passOne [7] = extraInformationAnswer;
        System.out.println(" ");
      
    // Dislays all information stored in the array
      System.out.println("Here is what was inputed! ");
      System.out.println(Arrays.deepToString(passOne));
      
    
  }
}