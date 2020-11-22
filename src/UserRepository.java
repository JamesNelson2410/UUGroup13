package GroupProject.UUGroup13.src;

/**
 * Define a User Repository Class
 */
public class UserRepository {
    private int nextArrayIndex = 0;
    private User[] users;

    protected UserRepository(){
        this.users = new User[1000];
    }//int amount

    protected User[] getUsers() {
        return this.users;
    }//getUsers

    protected void addUser( User newUser ){
        this.users[this.nextArrayIndex] = newUser;
        this.nextArrayIndex++;
    }//addUser

    protected int getNextArrayIndex() {
        return nextArrayIndex;
    }
}//class
