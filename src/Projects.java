package GroupProject.UUGroup13.src;

/**
 * Created by Anne Murphy on 17/11/2020
 */
public class Projects {

    String [] projectName = {"Belfast", "Krakow", "Berlin", "Dublin"};
    double[] projectBudget = {300,1500,750,300};

    public String[] getProjectName() {
        return new String[0];
    } //getProjectName

    public double[] getProjectBudget () {
        return projectBudget;
    } //getProjectBudget

    public void setprojectName(String[] projectName) {
        this.projectName = projectName;
    } //setprojectName

    public void setprojectBudget(double[] projectBudget) {
        this.projectBudget = projectBudget;
    }//setprojectBudget


}//class

