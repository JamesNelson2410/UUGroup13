package GroupProject.UUGroup13.src;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Define the Main Class
 */

public class Main {
   static Scanner kb = new Scanner(System.in);

   //Method for adding text at user input
   public static String enterString(String text) {
      System.out.println("Enter the " + text);
      return kb.nextLine();
   }//enterValue

   //Method for adding doubles at user input with input type error handling
   public static double enterDouble(String text) {
      double userDouble=0;
      do {
         try {
            System.out.println("Enter the " + text);
            userDouble = kb.nextDouble();
         } catch (InputMismatchException e) {
            System.out.print("Numbers must be entered to 2 decimal places\n");
            kb.nextLine();
         }

      } while (userDouble == 0 );
      return userDouble;
   }//enterValue

   //Method for boolean at user input
   public static boolean enterBoolean(String text) {
      System.out.println(text);
      return kb.nextBoolean();
   }//enterValue


   public static void main(String[] args) {

      int activeUser,activeProject,selection;
      activeProject = 0; //Placeholder
      String detail, paymentType, expenseType, currency, date;
      double net, gross, vat;
      boolean billable;

      //select project

      activeUser =  Login.userMenu();

      //Main Navigation window
      do {
         System.out.println("1. View Expenses\n2. Create Expenses\n3. Edit Profile\n-1. Quit");
         selection = Integer.parseInt(kb.nextLine());
         switch (selection) {

            //View Expenses
            case 1 -> {
               System.out.println("Let me find an expense"); //placeholder
               System.out.println("Show me all expenses"); //placeholder
            }//case1

            //Create Expense
            case 2 -> {
               System.out.println("Please enter the following details for your expense:\n");
               Expenses latestExpenseID = new Expenses( //need to place logic around grabbing expense ID from Expense
                       activeUser,
                       activeProject,
                       date = enterString("Date:"),
                       detail = enterString("Detail:"),
                       paymentType = enterString("Payment Type:"),//need to add selection from array
                       expenseType = enterString("Expense Type:"), //need to add selection from array
                       currency = enterString("Expenses Currency:"),//need to add selection from array
                       net = enterDouble("Net Amount:"),
                       vat = enterDouble("VAT Amount:"),
                       gross = enterDouble("Gross Amount:"),
                       billable = enterBoolean("Is the expenses billable? (true or false)") //not very user friendly, have to enter true or false, could use Y or N?
               );
               latestExpenseID.toString();
            }//case2

            //Update Profile
            case 3 -> {
               System.out.println("Use Conalls mutators");//placeholder
            }//case3
            //Quit
            case -1 -> {
               System.out.println("Goodbye");
               System.exit(0);
            }//case-1
         }//Selection
      }while(selection != 0);
      System.out.println("fell out of the loop");//testing placeholder - delete
   }//main
}//class
