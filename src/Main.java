import java.util.Scanner;

/**
 * Define the Main Class
 */

public class Main {
   static Scanner kb = new Scanner(System.in);

   public static String enterString(String text) {
      System.out.println("Enter the " + text);
      return kb.nextLine();
   }//return entered value as String

   public static int enterInt(String text) {
      System.out.println("Enter the " + text);
      return Integer.parseInt(kb.nextLine());
   }//return entered value as int

   public static double enterDouble(String text) {
      System.out.println("Enter the " + text);
      return Double.parseDouble(kb.nextLine());
   }//return entered value as double

   public static boolean enterBoolean(String text) {
      System.out.println(text);
      String enteredValue = kb.nextLine();
      Boolean result = ( enteredValue.equalsIgnoreCase("y"));
      return result;//return true if y or Y else return false
   }//return entered value as boolean

   public static Projects mapProjectIdToProject(int projectId, Projects[] allProjects) {
      for(int i=0; i<allProjects.length; i++){
         if(allProjects[i].getProjectId() == projectId){
            return allProjects[i];
         }
      }
      System.out.println("Project with ID " + projectId + " not found, setting as null");
      return null;
   }//given a projectId, return project object associated with that id

   public static void main(String[] args) {

      User activeUser;
      ExpenseRepository allExpenses = new ExpenseRepository();

      Projects[] allProjects = { new Projects("Belfast", 300),
                                 new Projects("Krakow", 1500),
                                 new Projects("Berlin", 750),
                                 new Projects("Dublin", 300)};
      //hardcoded array of project objects, projectId set in on constructor method

      while(true) {
         activeUser = Login.userMenu();
         if (activeUser != null) {
            //Main Navigation window
            boolean stayInLoop = true;
            while (stayInLoop == true) {
               System.out.println(  "1. View Expenses\n" +
                                    "2. Create Expenses\n" +
                                    "3. Edit Profile\n" +
                                    "-1. Logout");
               int selection = Integer.parseInt(kb.nextLine());
               switch (selection) {
                  //View Expenses
                  case 1 -> {
                     System.out.println(  "1. View your expenses\n" +
                                          "2. View expenses for project");
                     int expenseSelection = Integer.parseInt(kb.nextLine());
                     switch (expenseSelection) {
                        //User Expenses
                        case 1 -> {
                           allExpenses.printExpensesByUser(activeUser.getEmployeeId());
                           break;
                        }//user expenses

                        //Project Expenses
                        case 2 -> {
                           System.out.println("Enter project ID");
                           int projectId = Integer.parseInt(kb.nextLine());
                           Projects enteredProject = mapProjectIdToProject(projectId, allProjects);
                           String projectName = enteredProject.getProjectName();
                           double projectBudget = enteredProject.getProjectBudget();
                           System.out.println("You have selected the " + projectName + " project");
                           System.out.println(  "1. View all expenses for " + projectName +
                                                "\n2. View all billable expenses for " + projectName +
                                                "\n3. View all non-billable expenses for " + projectName +
                                                "\n4. Run budget report for " + projectName +
                                                "\n-1. Go back");
                           int projectExpenseSelection = Integer.parseInt(kb.nextLine());
                           switch(projectExpenseSelection){
                              case 1 -> {
                                 allExpenses.printAllExpensesByProject(projectId);
                                 break;
                              }
                              case 2 -> {
                                 allExpenses.printBillableExpensesByProject(projectId);
                                 break;
                              }
                              case 3 -> {
                                 allExpenses.printNonBillableExpensesByProject(projectId);
                                 break;
                              }
                              case 4 -> {
                                 allExpenses.printBudgetReportForProject(projectId, projectBudget);
                                 break;
                              }
                              case -1 -> {
                                 break;
                              }
                              default -> {
                                 System.out.println("Input not recognised");
                                 break;
                              }
                           }
                        }//project expenses
                     }
                  }//view expenses
                  //Create Expense
                  case 2 -> {
                     System.out.println("Please enter the following details for your expense:\n");
                     Expenses latestExpenseID = new Expenses( //need to place logic around grabbing expense ID from Expense
                             activeUser.getEmployeeId(),
                             mapProjectIdToProject(enterInt("ProjectId"), allProjects),
                             enterString("Date"),
                             enterString("Detail"),
                             enterString("Payment Type - Card/Cash"),//need to add selection from array
                             enterString("Expense Type"), //need to add selection from array
                             enterString("Expenses Currency"),//need to add selection from array
                             enterDouble("net amount"),
                             enterDouble("vat amount"),
                             enterBoolean("Is the expenses billable? (Y/N)") //changed to more user friendly (Y/N)
                     );
                     System.out.println("Expense created:");
                     System.out.println(latestExpenseID.toString());
                     allExpenses.addExpense(latestExpenseID);
                     break;
                  }//create expense
                  //Update Profile
                  case 3 -> {
                     System.out.println("1. Update username\n2. Update password\n3. Update name\n-1. Go back");
                     int profileUpdateSelection = Integer.parseInt(kb.nextLine());
                     switch (profileUpdateSelection) {
                        // Update username
                        case 1 -> {
                           String newUsername = enterString("username");
                           activeUser.setUsername(newUsername);
                           break;
                        }//username
                        // Update password
                        case 2 -> {
                           String newPassword = enterString("password");
                           activeUser.setPassword(newPassword);
                           break;
                        }//password
                        // Update name
                        case 3 -> {
                           String newName = enterString("name");
                           activeUser.setEmployeeName(newName);
                           break;
                        }//name
                        case -1 -> {
                           break;
                        }
                        default -> {
                           System.out.println("Input not recognised");
                           break;
                        }
                     }
                  }//update
                  //Quit
                  case -1 -> {
                     System.out.println("Goodbye");
                     stayInLoop = false;
                     break;
                  }//case-1
                  default -> {
                     System.out.println("Input not recognised");
                     break;
                  }
               }//Selection
            }
         }
      }
   }//main
}//class
