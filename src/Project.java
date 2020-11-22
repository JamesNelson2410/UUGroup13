package GroupProject.UUGroup13.src;

/**
 * Define the Project Class
 */
public class Project {
    private static int nextProjectId = 0;

    private int projectId;
    private String projectName;
    private double projectBudget;

    protected Project(String name, double budget){
        this.projectName = name;
        this.projectBudget = budget;
        this.projectId = nextProjectId++;
    }//constructor

    protected String getProjectName() {
        return this.projectName;
    } //getProjectName

    protected double getProjectBudget () {
        return this.projectBudget;
    } //getProjectBudget

    protected int getProjectId() {
        return projectId;
    }//getProjectId

    protected void setProjectName(String projectName) {
        this.projectName = projectName;
    } //setProjectName

    protected void setProjectBudget(double projectBudget) {
        this.projectBudget = projectBudget;
    }//setProjectBudget
}//class

