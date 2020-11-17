package GroupProject.UUGroup13.src;

/**
 * Define a User Class
 */

public class User {
    private static int nextId = 1;
    private int employeeId;
    private String employeeName;
    private String username;
    private String password;
    private boolean isAdmin;
    //Expense[] expenses;

    //Constructor to create a user object
    public User(String employeeName, String username, String password ){
        this.employeeId = nextId++;
        this.employeeName = employeeName;
        this.username = username;
        this.password = password;
    }//Constructor

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}//class
