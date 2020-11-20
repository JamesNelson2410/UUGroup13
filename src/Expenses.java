import java.text.DecimalFormat;

/**
 * Define a Expenses Class (extends Main)
 */
public class Expenses {
   DecimalFormat df = new DecimalFormat("00.00");

   private static int nextUniqueExpensesID = 1;
   private String detail, paymentType, expenseType, currency, date;
   private int employeeId, expensesID;
   private Projects project;
   private double net, gross, vat;
   private boolean isBillable;

   public Expenses() {
      expensesID = nextUniqueExpensesID;
      nextUniqueExpensesID = nextUniqueExpensesID + 1;
   }//Default Constructor

   public Expenses(int getEmployeeId,
                   Projects expensesProject,
                   String expenseDate,
                   String expenseDetail,
                   String pPaymenType,
                   String pExpenseType,
                   String expensesCurrency,
                   double pNet,
                   double pVat,
                   boolean isBillable) {
      expensesID = nextUniqueExpensesID;
      employeeId = getEmployeeId;
      project = expensesProject;
      date = expenseDate;
      detail = expenseDetail;
      paymentType = pPaymenType; //card/cash
      expenseType = pExpenseType;//hotel
      currency = expensesCurrency;
      net = pNet;
      vat = pVat;
      gross = pNet + pVat;
      this.isBillable = isBillable;
      nextUniqueExpensesID = nextUniqueExpensesID + 1;
   }//Constructor

//   protected void setProject(String expensesProject) {
//      project = expensesProject;
//   }//setDetail

//   protected String getProject() {
//      return project;
//   }//getProject

   protected void setDate(String expensesDate) {
      date = expensesDate;
   }//setDetail

   protected String getDate() {
      return date;
   }//getDate

   protected void setDetail(String expensesDetail) {
      detail = expensesDetail;
   }//setDetail

   protected String getDetail() {
      return detail;
   }//getDetail

   //NOTE CHECK TEST THIS METHOD - UNSURE ON ARRAY INDEX and STRING INTERACTION
   protected void setPaymentType(String expensesPaymentType) {
      paymentType = expensesPaymentType;
      String[] paymentType = {"Cash", "Card"};
      System.out.println(paymentType.length);
   }//setPaymentType

   protected String getPaymentType() {
      return paymentType;
   }//getExpenseType

   //NOTE CHECK TEST THIS METHOD - UNSURE ON ARRAY INDEX and STRING INTERACTION
   protected void setExpenseType(String expensesExpenseType) {
      expenseType = expensesExpenseType;
      String[] expenseType = {"Entertainment", "Travel/Transport", "Office Supplies", "Other"};
      System.out.println(expenseType.length);
   }//setExpenseType

   protected String getExpenseType() {
      return expenseType;
   }//getExpenseType

   protected void setCurrency(String expensesCurrency) {
      currency = expensesCurrency;
   }//setDetail

   protected String getCurrency() {
      return currency;
   }//getCurrency

   protected void setNet(int expensesNet) {
      net = expensesNet;
   }//setNet

   protected double getNet() {
      return net;
   }//getNet

   protected void setVat(double expensesVat) {
      vat = expensesVat;
   }//setVat

   protected double getVat() {
      return vat;
   }//getVat

   protected void setGross(double expensesGross) {
      gross = expensesGross;
   }//setGross

   protected double getGross() {
      return gross;
   }//getGross

   protected int getEmployeeId() {
      return employeeId;
   }//getEmployeeId

   protected Projects getProject() {
      return project;
   }//getProjectId

   protected boolean isBillable(){
      return isBillable;
   }

   @Override
   public String toString() {
      return "Expenses{" +
              "detail='" + detail + '\'' +
              ", paymentType='" + paymentType + '\'' +
              ", expenseType='" + expenseType + '\'' +
              ", currency='" + currency + '\'' +
              ", date='" + date + '\'' +
              ", project=" + project.getProjectName() +
              ", employeeId=" + employeeId +
              ", expensesID=" + expensesID +
              ", net=" + net +
              ", gross=" + gross +
              ", vat=" + vat +
              ", billable=" + isBillable +
              '}';
   }
}//class