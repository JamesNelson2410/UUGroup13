package GroupProject.UUGroup13.src;

import java.util.Scanner;

/**
 * Define the Main Class
 */

public class Main {
   static Scanner kb = new Scanner(System.in);

   public static String enterString(String text) {
      System.out.println("Enter the " + text);
      return kb.nextLine();
   }//enterValue

   public static double enterDouble(String text) {
      System.out.println("Enter the " + text);
      return kb.nextDouble();
   }//enterValue

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
                    date = enterString("Date"),
                    detail = enterString("Detail"),
                    paymentType = enterString("Payment Type"),//need to add selection from array
                    expenseType = enterString("Expense Type"), //need to add selection from array
                    currency = enterString("Expenses Currency"),//need to add selection from array
                    net = enterDouble("net amount"),
                    vat = enterDouble("vat amount"),
                    gross = enterDouble("gross amount"),
                    billable = enterBoolean("Is the expenses billable?") //not very user friendly, have to enter true or false, could use Y or N?
                    );
            latestExpenseID.toString();
            //latestExpenseID++;//needs to be added back in after logic is implemented for expenses ID count for object Type name

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

      System.out.println("fell out of the loop");//testing placeholder - delete
   }//main
}//class
