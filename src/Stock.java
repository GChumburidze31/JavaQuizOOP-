public class Stock {
    private String symbol; // data fields
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // i will create a constructor Stock
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // this method is used  to calculate and return the percentage change in stock price
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}

