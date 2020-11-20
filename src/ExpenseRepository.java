package GroupProject.UUGroup13.src;

import java.text.DecimalFormat;

/**
 * Define a Expense Repository Class
 */
public class ExpenseRepository {
    DecimalFormat df = new DecimalFormat("00.00");
    private int nextArrayIndex = 0;
    private Expense[] expense;

    public ExpenseRepository(){
        this.expense = new Expense[1000];
    }//int amount

    public Expense[] getUsers() {
        return this.expense;
    }//getUsers

    public void addExpense( Expense newExpense ){
        this.expense[this.nextArrayIndex] = newExpense;
        this.nextArrayIndex++;
    }//addUser

    public int getNextArrayIndex() {
        return nextArrayIndex;
    }//getNextArrayIndex

    public void printAllExpenses(){
        boolean foundExpenses = false;
        for(int i = 0; i<nextArrayIndex; i++) {
            foundExpenses = true;
            Expense expense = this.expense[i];
            System.out.println("Printing Expense #" + (i+1));
            System.out.println("\t" + expense.toString());

        }//for
        if(foundExpenses == false){
            System.out.println("No expenses exist in the system");
        }//if
    }//printAllExpenses

    public void printExpensesByUser(int userId){
        boolean foundExpenses = false;
        for(int i = 0; i<nextArrayIndex; i++) {
            Expense expense = this.expense[i];
            if (expense.getEmployeeId() == userId) {
                foundExpenses = true;
                System.out.println("Expense #" + (i+1) +" for user ID " + userId);
                System.out.println("\t" + expense.toString());
            }//if
        }//for
        if(foundExpenses == false){
            System.out.println("No expenses found for that user");
        }//if
    }//printExpensesByUser

    public void printAllExpensesByProject(int projectId){
        boolean foundExpenses = false;
        for(int i = 0; i<nextArrayIndex; i++) {
            Expense expense = this.expense[i];
            if (expense.getProject().getProjectId() == projectId) {
                foundExpenses = true;
                System.out.println("Expense #" + (i+1) +" for project ID " + projectId);
                System.out.println("\t" + expense.toString());
            }//if
        }//for
        if(foundExpenses == false){
            System.out.println("No expenses found for that project");
        }//if
    }//printAllExpensesByProject

    public void printBillableExpensesByProject(int projectId){
        boolean foundExpenses = false;
        for(int i = 0; i<nextArrayIndex; i++) {
            Expense expense = this.expense[i];
            if (expense.getProject().getProjectId() == projectId && expense.isBillable()) {
                foundExpenses = true;
                System.out.println("Expense #" + (i+1) +" for project ID " + projectId);
                System.out.println("\t" + expense.toString());
            }//if
        }//for
        if(foundExpenses == false){
            System.out.println("No billable expenses found for that project");
        }//if
    }//printBillableExpensesByProject

    public void printNonBillableExpensesByProject(int projectId){
        boolean foundExpenses = false;
        for(int i = 0; i<nextArrayIndex; i++) {
            Expense expense = this.expense[i];
            if (expense.getProject().getProjectId() == projectId && !expense.isBillable()) {//indicates must be false
                foundExpenses = true;
                System.out.println("Expense #" + (i+1) +" for project ID " + projectId);
                System.out.println("\t" + expense.toString());
            }//if
        }//for
        if(foundExpenses == false){
            System.out.println("No non-billable expenses found for that project");
        }//if
    }//printNonBillableExpensesByProject

    public void printBudgetReportForProject(int projectId, double projectBudget){
        boolean foundExpenses = false;
        double totalGross = 0.0;
        for(int i = 0; i<nextArrayIndex; i++) {
            Expense expense = this.expense[i];
            if (expense.getProject().getProjectId() == projectId) {
                foundExpenses = true;
                totalGross += expense.getGross();//+= means add to variable
            }//if
        }//for
        System.out.println("Total expense cost of project: £" + df.format(totalGross));
        if(totalGross <= projectBudget){
            System.out.println("The project is £" + df.format(projectBudget - totalGross) + " under budget");
        }//if
        else{
            System.out.println("The project is £" + df.format(totalGross - projectBudget) + " over budget");
        }//else
    }//printBudgetReportForProject
}//class
