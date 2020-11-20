package GroupProject.UUGroup13.src;

/**
 * Define the Project Class
 */
public class Project {
    private static int nextProjectId = 0;

    private int projectId;
    private String projectName;
    private double projectBudget;

    public Project(String name, double budget){
        this.projectName = name;
        this.projectBudget = budget;
        this.projectId = nextProjectId++;
    }//project

    public String getProjectName() {
        return this.projectName;
    } //getProjectName

    public double getProjectBudget () {
        return this.projectBudget;
    } //getProjectBudget

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    } //setProjectName

    public void setProjectBudget(double projectBudget) {
        this.projectBudget = projectBudget;
    }//setProjectBudget

    public int getProjectId() {
        return projectId;
    }//getProjectId
}//class

