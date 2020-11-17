package GroupProject.UUGroup13.src;

import java.text.DecimalFormat;

/**
 * Define a Expenses Class (extends Main)
 */
public class Expenses {
   DecimalFormat df = new DecimalFormat("00.00");

   private static int nextUniqueExpensesID = 1;
   private String project, detail, paymentType, expenseType, currency;
   private double employeeId, expensesID, date, vat;
   private int net, gross;
   private boolean billable;

   public Expenses() {
      expensesID = nextUniqueExpensesID;
      nextUniqueExpensesID = nextUniqueExpensesID + 1;
   }//Default Constructor

   public Expenses(double getEmployeeId, String expensesProject, String expensesCurrency, boolean isBillable) {
      expensesID = nextUniqueExpensesID;
      employeeId = getEmployeeId;
      project = expensesProject;
      date = 0;
      detail = "";
      paymentType = "";
      expenseType = "";
      currency = expensesCurrency;
      net = 0;
      vat = 0;
      gross = 0;
      billable = isBillable;
      nextUniqueExpensesID = nextUniqueExpensesID + 1;
   }//Constructor

   protected void setProject(String expensesProject) {
      project = expensesProject;
   }//setDetail

   protected String getProject() {
      return project;
   }//getProject

   protected void setDate(double expensesDate) {
      date = expensesDate;
   }//setDetail

   protected double getDate() {
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
   }//setDetail

   protected String getCurrency() {
      return currency;
   }//getCurrency

   protected void setNet(int expensesNet) {
      net = expensesNet;
   }//setNet

   protected int getNet() {
      return net;
   }//getNet

   protected void setVat(double expensesVat) {
      vat = expensesVat;
   }//setVat

   protected double getVat() {
      return vat;
   }//getVat

   protected void setGross(int expensesGross) {
      gross = expensesGross;
   }//setGross

   protected int getGross() {
      return gross;
   }//getGross
}//class