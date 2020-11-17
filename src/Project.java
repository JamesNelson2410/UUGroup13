package GroupProject.UUGroup13.src;

/**
 * Define a Project Class (extends Main)
 */
public class Project extends Main {

   String [] projectName = {"Belfast", "Krakow", "Berlin", "Dublin"};
   double[] projectBudget;

   public String[] getProjectName() {
      return new String[0];
   } //getProjectName

   public double[] getProjectBudget () {
      return projectBudget;
   } //getProjectBudget

   public void setProjectName(String[] projectName) {
      this.projectName = projectName;
   } //setProjectName

   public void setProjectBudget(double[] projectBudget) {
      this.projectBudget = projectBudget;
   }//setProjectBudget
}//class