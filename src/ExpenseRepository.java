import java.text.DecimalFormat;

public class ExpenseRepository {
    DecimalFormat df = new DecimalFormat("00.00");
    private int nextArrayIndex = 0;
    private Expenses[] expenses;

    public ExpenseRepository(){
        this.expenses = new Expenses[1000];
    }

    public Expenses[] getUsers() {
        return this.expenses;
    }

    public void addExpense( Expenses newExpense ){
        this.expenses[this.nextArrayIndex] = newExpense;
        this.nextArrayIndex++;
    }//addUser

    public int getNextArrayIndex() {
        return nextArrayIndex;
    }

    public void printAllExpenses(){
        boolean foundExpenses = false;
        for(int i = 0; i<nextArrayIndex; i++) {
            foundExpenses = true;
            Expenses expense = expenses[i];
            System.out.println("Printing Expense #" + (i+1));
            System.out.println("\t" + expense.toString());

        }
        if(foundExpenses == false){
            System.out.println("No expenses exist in the system");
        }
    }

    public void printExpensesByUser(int userId){
        boolean foundExpenses = false;
        for(int i = 0; i<nextArrayIndex; i++) {
            Expenses expense = expenses[i];
            if (expense.getEmployeeId() == userId) {
                foundExpenses = true;
                System.out.println("Expense #" + (i+1) +" for user ID " + userId);
                System.out.println("\t" + expense.toString());
            }
        }
        if(foundExpenses == false){
            System.out.println("No expenses found for that user");
        }
    }

    public void printAllExpensesByProject(int projectId){
        boolean foundExpenses = false;
        for(int i = 0; i<nextArrayIndex; i++) {
            Expenses expense = expenses[i];
            if (expense.getProject().getProjectId() == projectId) {
                foundExpenses = true;
                System.out.println("Expense #" + (i+1) +" for project ID " + projectId);
                System.out.println("\t" + expense.toString());
            }
        }
        if(foundExpenses == false){
            System.out.println("No expenses found for that project");
        }
    }

    public void printBillableExpensesByProject(int projectId){
        boolean foundExpenses = false;
        for(int i = 0; i<nextArrayIndex; i++) {
            Expenses expense = expenses[i];
            if (expense.getProject().getProjectId() == projectId && expense.isBillable()) {
                foundExpenses = true;
                System.out.println("Expense #" + (i+1) +" for project ID " + projectId);
                System.out.println("\t" + expense.toString());
            }
        }
        if(foundExpenses == false){
            System.out.println("No billable expenses found for that project");
        }
    }

    public void printNonBillableExpensesByProject(int projectId){
        boolean foundExpenses = false;
        for(int i = 0; i<nextArrayIndex; i++) {
            Expenses expense = expenses[i];
            if (expense.getProject().getProjectId() == projectId && !expense.isBillable()) { //! indicates must be false
                foundExpenses = true;
                System.out.println("Expense #" + (i+1) +" for project ID " + projectId);
                System.out.println("\t" + expense.toString());
            }
        }
        if(foundExpenses == false){
            System.out.println("No non-billable expenses found for that project");
        }
    }

    public void printBudgetReportForProject(int projectId, double projectBudget){
        boolean foundExpenses = false;
        double totalGross = 0.0;
        for(int i = 0; i<nextArrayIndex; i++) {
            Expenses expense = expenses[i];
            if (expense.getProject().getProjectId() == projectId) {
                foundExpenses = true;
                totalGross += expense.getGross();//+= means add to variable
            }
        }
        System.out.println("Total expense cost of project: £" + df.format(totalGross));
        if(totalGross <= projectBudget){
            System.out.println("The project is £" + df.format(projectBudget - totalGross) + " under budget");
        }
        else{
            System.out.println("The project is £" + df.format(totalGross - projectBudget) + " over budget");
        }
    }
}
