public class UserRepository {
    private int nextArrayIndex = 0;
    private User[] users;

    public UserRepository(){
        this.users = new User[1000];
    }

    public User[] getUsers() {
        return this.users;
    }

    public void addUser( User newUser ){
        this.users[this.nextArrayIndex] = newUser;
        this.nextArrayIndex++;
    }

    public int getNextArrayIndex() {
        return nextArrayIndex;
    }
}
