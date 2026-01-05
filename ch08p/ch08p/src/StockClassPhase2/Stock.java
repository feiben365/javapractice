package StockClassPhase2;

public class Stock
{
 private String symbol;
 private double sharePrice;

 public Stock(String sym, double price)
 {
     symbol = sym;
     sharePrice = price;
 }

 public String getSymbol ()
 {
     return symbol;
 }

 public String toString()
 {
     String str = "Symbol: " + symbol +
             "\nShare price: " + sharePrice;
    return str;
 }
  public boolean equals(Stock object2)
  {
      boolean status;

      if(symbol.equals(object2.getSymbol()) &&
      sharePrice == object2.sharePrice)
          status = true;
      else
          status = false;
    return status;
  }
}
