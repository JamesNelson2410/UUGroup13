package GroupProject.UUGroup13.src;

import java.text.DecimalFormat;

/**
 * Define a Currencies Class (extends Expenses)
 */
public class Currencies extends Main {
   DecimalFormat df = new DecimalFormat("00.00");

   private static int nextUniqueCurrencyID = 1;
   private int currencyID;
   private String currency;
   private double date, rate;

   public Currencies() {
      super ();
      currencyID = nextUniqueCurrencyID;
      nextUniqueCurrencyID = nextUniqueCurrencyID + 1;
   }//Default Constructor

   public Currencies(String currenciesCurrency, double currenciesDate, double currenciesRate) {
      super ();
      currencyID = nextUniqueCurrencyID;
      currency = "";
      date = 0;
      rate = 0;
      nextUniqueCurrencyID = nextUniqueCurrencyID + 1;
   }//Constructor

   protected void setDate(double currenciesDate) {
      date = currenciesDate;
   }//setDate

   protected void setCurrency(String currenciesCurrency) {
      currency = currenciesCurrency;
   }//setCurrency

   protected void setRate(double currenciesRate) {
      rate = currenciesRate;
   }//setRate
}//class