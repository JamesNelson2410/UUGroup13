package UUGroup13.src;

import java.util.Scanner;

/**
 * Define the Main Class
 */


public class Main {


   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int activeUser,activeProject,selection;
      activeUser =  Login.userMenu();

      //select project

      //Main Navigation window
      System.out.println("1. View Expenses\n2. Create Expenses\n3. Edit Profile\n-1. Quit");
      selection = Integer.parseInt(keyboard.nextLine());
      switch (selection) {

         //View Expenses
         case 1 -> {
            System.out.println("Let me find an expense"); //placeholder
            System.out.println("Show me all expenses"); //placeholder
         }//case1

         case 2 -> {
            System.out.println("Use Marks Expenses class");//placeholder
         }//case2

         case 3 -> {
            System.out.println("Use Conalls mutators");//placeholder
         }//case3

         case -1 -> {
            System.out.println("Goodbye");
            System.exit(0);
         }//case-1
      }//Selection

      System.out.println("fell out of the loop");//testing placeholder
   }//main
}//class
