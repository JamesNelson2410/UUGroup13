package GroupProject.UUGroup13.src;

import java.util.Scanner;

/**
 * Define the Login Class
 */
public class Login {
    private static UserRepository userRepository = new UserRepository();

    protected static User userInRepo(String enteredUsername, String enteredPassword, UserRepository repo) {//changed from boolean to int in method type
        User[] users = repo.getUsers();
        for (int i = 0; i < repo.getNextArrayIndex(); i++) {
            User user = users[i];
            String userUsername = user.getUsername();
            String userPassword = user.getPassword();
            if ((userUsername.equals(enteredUsername)) && (userPassword.equals(enteredPassword))) {
                return user;//changed from true to return variable for Mark
            }//if
        }//for
        return null;
    }//userInRepo

    protected static User userMenu() {
        Scanner keyboard = new Scanner(System.in);

        String enteredUsername, enteredPassword, enteredName;
        User activeEmployee = null;
        int selection;
        User userExists; //changed to int from boolean
        boolean keepLooping = true;

        while (keepLooping) {
            System.out.println("1. Login\n2. Create Account\n-1. Exit");
            selection = Integer.parseInt(keyboard.nextLine());
            switch (selection) {
                //Login
                case 1 -> {
                    System.out.println("LOGIN:");
                    System.out.println("Please enter username");
                    enteredUsername = keyboard.nextLine();
                    System.out.println("Please enter password");
                    enteredPassword = keyboard.nextLine();
                    userExists = Login.userInRepo(enteredUsername, enteredPassword, userRepository);
                    if (userExists != null) { //added in handling for 0 returned from method in place of false
                        System.out.println("Congratulations " + enteredUsername + "...What would you like to do?");
                        activeEmployee = userExists;
                        keepLooping = false;
                    }//if
                    else {
                        System.out.println("No user found, try again.");
                    }//else
                }//case1

                //Create user
                case 2 -> {
                    System.out.println("ACCOUNT CREATION:");
                    System.out.println("Please enter username");
                    enteredUsername = keyboard.nextLine();
                    System.out.println("Please enter password");
                    enteredPassword = keyboard.nextLine();
                    System.out.println("Please enter name");
                    enteredName = keyboard.nextLine();
                    User newUser = new User(enteredName, enteredUsername, enteredPassword);
                    userRepository.addUser(newUser);
                }//case2

                case -1 -> {
                    System.out.println("Goodbye from login");
                    System.exit(0);}
                default -> System.out.println("Input not recognised");
            }//switch
        }//while
        return activeEmployee;
    }//userMenu
}//class 
