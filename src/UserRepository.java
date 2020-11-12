package GroupProject.UUGroup13.src;

/**
 * Define a UserRepository Class
 */

public class UserRepository {
    private int nextArrayIndex = 0;
    private User[] users;

    public UserRepository(){
        this.users = new User[1000];
    }//UserRepository

    public User[] getUsers() {
        return this.users;
    }//getUsers

    public void addUser(User newUser){
        this.users[this.nextArrayIndex] = newUser;
        this.nextArrayIndex++;
    }//addUser

    public int getNextArrayIndex() {
        return nextArrayIndex;
    }//getNextArrayIndex
}//class
