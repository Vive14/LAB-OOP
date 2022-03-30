public class Stock {
    private String symbol;
    private String name;
    private Double previousClosingPrice;
    private Double currentPrice;

    public void setSymbol(String symbol){
       this.symbol = symbol;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPreviousClosingPrice(Double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(Double currentPrice){
        this.currentPrice = currentPrice;
    }

    public Double getPreviousClosingPrice(){
        return this.previousClosingPrice;
    }

    public Double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
    }

    public void displayStock(){
        System.out.println("Symbol: "+ this.symbol);
        System.out.println("Name: "+ this.name);
        System.out.println("Previous Closing Price: "+ this.previousClosingPrice);
        System.out.println("Current Price: "+ this.currentPrice);
        System.out.println("Price Change: "+ this.getChangePercent()+"%");
    }
}