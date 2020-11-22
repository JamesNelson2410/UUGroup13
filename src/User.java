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

    //Constructor to create a user object
    protected User(String employeeName, String username, String password ){
        this.employeeId = nextId++;
        this.employeeName = employeeName;
        this.username = username;
        this.password = password;
    }//Constructor

    protected int getEmployeeId() {
        return employeeId;
    }//getEmployeeId

    protected String getEmployeeName() {
        return employeeName;
    }//getEmployeeName

    protected String getPassword() {
        return password;
    }//getPassword

    protected String getUsername() {
        return username;
    }//getUsername

    protected void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }//setEmployeeName

    protected void setPassword(String password) {
        this.password = password;
    }//setPassword

    protected void setUsername(String username) {
        this.username = username;
    }//setUsername

}//class
