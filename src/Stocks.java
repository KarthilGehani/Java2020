import java.util.Date;

public class Stocks {
//name of stock
    private String Name;
//Price of stock when bought
    private double Pricewhenpurchased;
//date of purchase
    private Date PurchaseDate;
//amount of stock purchased
    private int QuantityofStock;
//    The price of your stock now
    private double CurrentPrice;
//    Did they buy(True) or sell (sell)
    private boolean Buyorsell;
//    the default code
    public Stocks(){
        Name = "empty";
        QuantityofStock = 0;
    }

    public Stocks(String name1, double purchaseprice1, Date purchasedate1, int quantity1, double currentprice1, boolean buyorsell1) {
        Name = name1;
        Pricewhenpurchased = purchaseprice1;
        PurchaseDate = purchasedate1;
        QuantityofStock = quantity1;
        CurrentPrice = currentprice1;
        Buyorsell = buyorsell1;
    }
//    These are allof my set variables
    public void setName(String name1){
       Name = name1;
    }
    public void setPricewhenpurchased(double purchaseprice1){
        Pricewhenpurchased = purchaseprice1;
    }
    public void setPurchaseDate(Date purchasedate1){
        PurchaseDate = purchasedate1;
    }
    public void setQuantityofStock(int quantity1){
        QuantityofStock = quantity1;
    }
    public void setCurrentPrice(double currentprice1){
        CurrentPrice = currentprice1;
    }
    public void setBuyorsell(boolean buyorsell1){
        Buyorsell = buyorsell1;
    }
    public String getName(){
        return Name;
    }
    public double getPricewhenpurchased(){
        return Pricewhenpurchased;
    }
    public Date getPurchaseDate(){
        return PurchaseDate;
    }
    public int getQuantityofStock(){
        return QuantityofStock;
    }
    public double getCurrentPrice(){
        return CurrentPrice;
    }
    public boolean setBuyorsell(){
        return Buyorsell;
    }
    public boolean Profit(){
        double Profit = (CurrentPrice - Pricewhenpurchased) * QuantityofStock;
        return Profit();
    }
    public String toString() {
        return "The name of your stock is "+Name+" the date you purchased it on is "+PurchaseDate+" the price you purchased the stock for was "+Pricewhenpurchased+" the amount of this stock you purchased is "+QuantityofStock+" the current price of the stock is "+CurrentPrice+" Did you buy or sell the stock "+Buyorsell;
    }











}