package UUGroup13.src;

import java.text.DecimalFormat;

/**
 * Define a Expenses Class (extends Main)
 */
abstract public class Expenses extends Main {
   DecimalFormat df = new DecimalFormat("00.00");

   //**Changed EmployeeID & Date to double from string**
   //**Change NET & VAT from double to int**
   //**Do we need EmployeeID?**
   private String project, detail, paymentType, expenseType, currency;
   private double employeeID, date, vat;
   private int net, gross;
   private boolean billable;

   public Expenses() {
      super(employeeID);
   }//Default Constructor

   //**Need detail for this constructor**
   //public Expenses(String, String, double, String, int, String, boolean) {
      //super(employeeID);
      //String = ;
      //String = ;
      //double = ;
      //String = ;
      //int = ;
      //String = ;
      //boolean = ;
      //nextUniqueEmployeeID = nextUniqueEmployeeID + 1;
   //}//Constructor

   //**Another empty constructor?**
   //public Expenses(String, String, double, String, int, String, boolean) {
      //super(employeeID);
      //String = "";
      //String = "";
      //double = 0;
      //String = "";
      //int = 0;
      //String = "";
      //boolean = "";
      //nextUniqueEmployeeID = nextUniqueEmployeeID + 1;
   //}//Constructor

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

   protected void setBillable(boolean expensesBillable) {
      billable = expensesBillable;
   }//setBillable

   protected boolean getBillable() {
      return billable;
   }//getBillable
}//class