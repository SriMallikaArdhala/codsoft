//  the current currency exchange rates available in this link - https://www.xe.com/currencyconverter/
import java.util.*;
public class CurrencyConvertor {
   public static void main(String args[]){
      while(true){
         Scanner sc=new Scanner(System.in);
            System.out.println("\nCurrency Converting ");
            System.out.println("Available currencies are 1.USD 2.INR 3.EURO 4.POUNDS ");
            System.out.println("Enter Amount : ");
            double amount=sc.nextDouble();
            System.out.println("From Currency : ");
            String from=sc.next().toUpperCase();
            System.out.println("To Currency : ");
            String to=sc.next().toUpperCase();
            double convertedamount=conversion(amount,from,to);
            System.out.printf("The conversion %.2f %s is converted to %.2f %s\n",amount,from,convertedamount,to);
            System.out.println("If you want to continue press 'Y' otherwise 'N'.");
            String s=sc.next();
            if(s.equalsIgnoreCase("Y"))continue;
            else{System.exit(0);}
      }
   }
   static double conversion(double amount,String from,String to){
      if (from.equals("USD")) {// from usd to inf euro and pounds
         if (to.equals("INF")) {
             System.out.println("1 USD = 85.882 INF");
             return amount * 85.882;
         } else if (to.equals("EURO")) {
             System.out.println("1 USD = 0.97048 EURO");
             return amount * 0.97048;
         } else if (to.equals("POUND")) {
             System.out.println("1 USD = 0.81239 POUND");
             return amount * 0.81239;
         }
     } else if (from.equals("INF")) {//conversion form inf to euro usd and pounds
         if (to.equals("USD")) {
             System.out.println("1 INF = 0.011644 USD");
             return amount * 0.011644;
         } else if (to.equals("EURO")) {
             System.out.println("1 INF = 0.011301 EURO");
             return amount * 0.011301;
         } else if (to.equals("POUND")) {
             System.out.println("1 INF = 0.0094576 POUND");
             return amount * 0.0094576;
         }
     } else if (from.equals("EURO")) {//from euro to usd inf and pounds
         if (to.equals("INF")) {
             System.out.println("1 EURO = 88.493 INF");
             return amount * 88.493;
         } else if (to.equals("USD")) {
             System.out.println("1 EURO = 1.0304 USD");
             return amount * 1.0304;
         } else if (to.equals("POUND")) {
             System.out.println("1 EURO = 0.83688 POUND");
             return amount * 0.83688;
         }
     } else if (from.equals("POUND")) {//from pounds to usd inf and euro
         if (to.equals("INF")) {
             System.out.println("1 POUND = 105.72 INF");
             return amount * 105.72;
         } else if (to.equals("EURO")) {
             System.out.println("1 POUND = 1.1948 EURO");
             return amount * 1.1948;
         } else if (to.equals("USD")) {
             System.out.println("1 POUND = 1.2310 USD");
             return amount * 1.2310;
         }
     }
      return 0;
   } 
}
