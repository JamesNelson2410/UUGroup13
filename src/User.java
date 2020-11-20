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

    //Constructor to create a user object
    public User(String employeeName, String username, String password ){
        this.employeeId = nextId++;
        this.employeeName = employeeName;
        this.username = username;
        this.password = password;
    }//Constructor

    public int getEmployeeId() {
        return employeeId;
    }//getEmployeeId

    public String getEmployeeName() {
        return employeeName;
    }//getEmployeeName

    public String getPassword() {
        return password;
    }//getPassword

    public String getUsername() {
        return username;
    }//getUsername

    public boolean isAdmin() {
        return isAdmin;
    }//isAdmin

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }//setEmployeeName

    public void setPassword(String password) {
        this.password = password;
    }//setPassword

    public void setUsername(String username) {
        this.username = username;
    }//setUsername

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }//setAdmin
}//class
