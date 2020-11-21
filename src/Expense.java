package GroupProject.UUGroup13.src;

import java.text.DecimalFormat;

/**
 * Define a Expense Class
 */
public class Expense {
   DecimalFormat df = new DecimalFormat("00.00");

   private static int nextUniqueExpensesID = 1;
   private String detail, paymentType, expenseType, currency, date;
   private int employeeId, expensesID;
   private Project project;
   private double net, gross, vat;
   private boolean isBillable;

   public Expense() {
      expensesID = nextUniqueExpensesID;
      nextUniqueExpensesID = nextUniqueExpensesID + 1;
   }//Default Constructor

   public Expense(int getEmployeeId,
                  Project expensesProject,
                  String expenseDate,
                  String expenseDetail,
                  String pPaymentType,
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
      paymentType = pPaymentType;
      expenseType = pExpenseType;
      currency = expensesCurrency;
      net = pNet;
      vat = pVat;
      gross = pNet + pVat;
      this.isBillable = isBillable;
      nextUniqueExpensesID = nextUniqueExpensesID + 1;
   }//Constructor

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

   protected void setPaymentType(String expensesPaymentType) {
      paymentType = expensesPaymentType;
      String[] paymentType = {"Cash", "Card"};
      System.out.println(paymentType.length);
   }//setPaymentType

   protected String getPaymentType() {
      return paymentType;
   }//getExpenseType

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
   }//setCurrency

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

   protected Project getProject() {
      return project;
   }//getProjectId

   protected boolean isBillable(){
      return isBillable;
   }//isBillable

   @Override
   public String toString() {
      return "Expenses{" +
              "project=" + project.getProjectName() +
              ", date='" + date + '\'' +
              ", detail='" + detail + '\'' +
              ", paymentType='" + paymentType + '\'' +
              ", expenseType='" + expenseType + '\'' +
              ", currency='" + currency + '\'' +
              ", employeeId=" + employeeId +
              ", expensesID=" + expensesID +
              ", net=" + df.format(net) +
              ", gross=" + df.format(gross) +
              ", vat=" + df.format(vat) +
              ", billable=" + isBillable +
              '}';
   }//toString
}//class