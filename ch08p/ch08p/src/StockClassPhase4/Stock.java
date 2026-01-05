package StockClassPhase4;

public class Stock
{
    private String symbol;
    private double sharePrice;

    public Stock(String sym, double price)
    {
        symbol = sym;
        sharePrice = price;
    }

    public Stock(Stock object2)
    {
        symbol = object2.symbol;
        sharePrice = object2.sharePrice;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public double getSharePrice()
    {
        return sharePrice;
    }

    public String toString()
    {
        String str = "Trading Symbol: " + symbol +
                "\nShare Price: " + sharePrice;

        return str;
    }

    public boolean equals(Stock object2)
    {
        boolean status;

        if (symbol.equals(object2.symbol) &&
        sharePrice == object2.sharePrice)
            status = true;
        else status = false;

        return status;
    }

    public Stock copy()
    {
        Stock copyObject = new Stock(symbol, sharePrice);
        return copyObject;
    }
}
