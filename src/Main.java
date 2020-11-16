package GroupProject.UUGroup13.src;

import java.util.Scanner;

/**
 * Define the Main Class
 */

public class Main {

   private static boolean userInRepo(String enteredUsername, String enteredPassword, UserRepository repo) {
      User[] users = repo.getUsers();
      for (int i = 0; i < repo.getNextArrayIndex(); i++) {
         User user = users[i];
         String userUsername = user.getUsername();
         String userPassword = user.getPassword();

         if ((userUsername == enteredUsername) && (userPassword == enteredPassword)) {
            return true;
         }//if
      }//for
      return false;
   }//main

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      UserRepository userRepository = new UserRepository();

      String enteredUsername, enteredPassword, enteredName;
      int selection;
      boolean userExists;
      boolean keepLooping = true;

      while(keepLooping) {
         System.out.println("1. Login\n2. Create Account\n-1. Exit");
         selection = Integer.valueOf(keyboard.nextLine());
         switch (selection) {
            case 1: //Login
               System.out.println("In login");
               System.out.println("Pls enter username");
               enteredUsername = keyboard.nextLine();
               System.out.println("Pls enter password");
               enteredPassword = keyboard.nextLine();
               userExists = userInRepo(enteredUsername, enteredPassword, userRepository);
               if (userExists) {
                  System.out.println("Congrats " + enteredUsername);

               }//if
               else {
                  System.out.println("No user found, try again.");
               }//else
               break;
            case 2: //Create user
               System.out.println("In create");
               System.out.println("Pls enter username");
               enteredUsername = keyboard.nextLine();
               System.out.println("Pls enter password");
               enteredPassword = keyboard.nextLine();
               System.out.println("Pls enter name");
               enteredName = keyboard.nextLine();
               User newUser = new User(enteredName, enteredUsername, enteredPassword);
               userRepository.addUser(newUser);
               break;
            default:
               keepLooping = false;
         }//switch
      }//while
      System.out.println("Goodbye");
   }//main
}//class
