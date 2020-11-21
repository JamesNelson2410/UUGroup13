package UUGroup13.src;

import java.util.Scanner;

/**
 * Created by James Nelson on 17/11/2020
 */
public class Login {

    protected static int userInRepo(String enteredUsername, String enteredPassword, UserRepository repo) {//changed from boolean to int in method type
        User[] users = repo.getUsers();
        for (int i = 0; i < repo.getNextArrayIndex(); i++) {
            User user = users[i];
            String userUsername = user.getUsername();
            String userPassword = user.getPassword();

            if ((userUsername.equals(enteredUsername)) && (userPassword.equals(enteredPassword))) {
                return user.getEmployeeId();//changed from true to return variable for Mark

            }//if
        }//for
        return 0; //Conall changed this to 0 from false
    }//userInRepo


    public static int userMenu() {
        Scanner keyboard = new Scanner(System.in);
        UserRepository userRepository = new UserRepository();

        String enteredUsername, enteredPassword, enteredName;
        int activeEmployee = 0;
        int selection;
        int userExists; //changed to int from boolean
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
                    if (userExists != 0) { //added in handling for 0 returned from method in place of false
                        System.out.println("Congrats " + enteredUsername + "... What would yu like to do?");
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

                case -1 -> {System.exit(0);}
                default -> keepLooping = false;
            }//switch
        }//while
        return activeEmployee;
    }
}//class 
