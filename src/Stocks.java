//This program is for monitoring your stock account
import java.time.LocalDate;
import java.util.Scanner;
public class Stocks {
//name of stock
    private String Name;
//Price of stock when bought
    private double Pricewhenpurchased;
//date of purchase
    private String PurchaseDate;
//amount of stock purchased
    private int QuantityofStock;
//    The price of your stock now
    private double CurrentPrice;
//    Did they buy(True) or sell (sell)
    private boolean Buyorsell;
//    the account number
    private int AccountNumber;
//    default
    public Stocks(){
        Name = "empty";
        QuantityofStock = 0;
    }
//    This is to make the set and get
    public Stocks(String name1, double purchaseprice1, String purchasedate1, int quantity1, double currentprice1, boolean buyorsell1, int accountnumber1) {
        Name = name1;
        Pricewhenpurchased = purchaseprice1;
        PurchaseDate = purchasedate1;
        QuantityofStock = quantity1;
        CurrentPrice = currentprice1;
        Buyorsell = buyorsell1;
        AccountNumber = accountnumber1;
    }
//    These are all of my set variables
    public void setName(String name1){
       Name = name1;
    }
    public void setPricewhenpurchased(double purchaseprice1){
        Pricewhenpurchased = purchaseprice1;
    }
    public void setPurchaseDate(String purchasedate1){
        PurchaseDate = purchasedate1;
    }
    public void setQuantityofStock(int quantity1){
        QuantityofStock = quantity1;
    }
    public void setCurrentPrice(double currentprice1){ CurrentPrice = currentprice1; }
    public void setBuyorsell(boolean buyorsell1){
        Buyorsell = buyorsell1;
    }
    public void SetAccountNumber(int SetAccountNumber) {AccountNumber = SetAccountNumber;}
//    These are all of my get variables
    public String getName(){
        return Name;
    }
    public double getPricewhenpurchased(){
        return Pricewhenpurchased;
    }
    public String getPurchaseDate(){
        return PurchaseDate;
    }
    public int getQuantityofStock(){
        return QuantityofStock;
    }
    public double getCurrentPrice(){
        return CurrentPrice;
    }
    public boolean getBuyorsell(){
        return Buyorsell;
    }
    public int getAccountNumber() {return AccountNumber;}
//    This is a method to calculate profit
    public boolean Profit(){
        double Profit = (CurrentPrice - Pricewhenpurchased) * QuantityofStock;
        return Profit();
    }
//    This is my tostring for printing
    public String toString() {
        return "The name of your stock is "+Name+" the date you purchased it on is "+PurchaseDate+" the price you purchased the stock for was "+Pricewhenpurchased+" the amount of this stock you purchased is "+QuantityofStock+" the current price of the stock is "+CurrentPrice+" Did you buy or sell the stock "+Buyorsell;
    }











}