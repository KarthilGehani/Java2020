import java.io.File;
import java.time.LocalDate;
import java.util.*;
import java.io.FileNotFoundException;
public class StocksClient {
    LocalDate mydate = LocalDate.now();
//    This is for the amount of stocks in my databse
    public static Stocks[] stock = new Stocks[20];
    public static void main(String[] args) throws FileNotFoundException {
//       This is to copy path from the file
        Scanner fileinput = new Scanner (new File("C:\\Users\\GehaniK24\\IdeaProjects\\Java 2020_2021\\src\\FinalProdjectFile"));
            while (fileinput.hasNextLine()) {
                String line = fileinput.nextLine();
                Scanner mini = new Scanner(line);
                while (mini.hasNext()) {
                    String Name = mini.next();
                    double Pricewhenpurchased = mini.nextDouble();
                    String PurchaseDate = mini.next();
                    int QuantityofStock = mini.nextInt();
                    double CurrentPrice = mini.nextDouble();
                    boolean Buyorsell = mini.nextBoolean();
                    int AccountNumber = mini.nextInt();
                }
            }
//            this is my menu and the questions i ask
                System.out.println("                  Stock Management System                        ");
                System.out.println("        1. What is your account number?                           ");
                System.out.println("        2. Do you want to buy stock?                            ");
                System.out.println("        3. Do you want to sell stock?   ");
                System.out.println("        4. Do you want to close a position?              ");
                System.out.println("        5. Do yo want to know your acount balance?");
                System.out.println("        6. Exit                                                  ");
                Scanner input = new Scanner(System.in);
                int beloworabove = input.nextInt();
//               these are my switch and cases so I can call my methods based on the number of each question
                switch (beloworabove) {
                    case 1:
                        AccountNumber(input);
                        break;
                    case 2:
                        BuyStock(input);
                        break;
                    case 3:
                        SellStock(input);
                        break;
                    case 4:
                        ClosePosition(input);
                        break;
                    case 5:
                        AccountBalance(input);
                        break;
                    case 6:
                        exit(input);
                        break;

                }


            }

//This is my method for the first question to find the account number
    public static void AccountNumber(Scanner input){
        System.out.println("What is your account number?");
        int AccountNumber = input.nextInt();
        }
//        This is my method for the second question to see if I want to buy stock
    public static void BuyStock(Scanner input){
        System.out.println("Do you want to buy stock?");
        Boolean BuyStock = input.nextBoolean();
            System.out.println("Which stock would you like to buy?");
            String name = input.next();
            System.out.println("What quantity of stock would you like to buy?");
            int quantity = input.nextInt();
            System.out.println("What is the price of the stock you want to buy?");
            double price = input.nextDouble();
            }
//            This is my method to see if you want to sell any of your existing stocks
    public static void SellStock(Scanner input){
        System.out.println("Do you want to sell stock?");
        int SellStock = input.nextInt();
                System.out.println("Which stock would you like to sell?");
                String name = input.next();
                System.out.println("How much of that stock would you like to sell?");
                int quantity = input.nextInt();
                System.out.println("What is the current price of the stock you want to sell?");
                double price = input.nextDouble();
    }
//    This is the method to see if you want to close a position and if you want to buy or sell
    public static void ClosePosition(Scanner input){
        System.out.println("Do you want to close a position");
        String closeposition = input.next();
        System.out.println("Which stock do you want to close?");
        String name = input.next();
        System.out.println("What is the current price of the stock you want to close?");
        double price = input.nextDouble();
        System.out.println("Do you wantto buy or sell?");
        String buyorsell  = input.next();
        System.out.println("How much of that stock would you like to close?");
        int closequantity = input.nextInt();
    }
//    This is my method to calculate to account balance
    public static void AccountBalance(Scanner input){
        System.out.println("Do you want to know your account balance?");
        double accountbalance = input.nextDouble();
    }
//    Thia ia my method to exit the program
    public static void exit(Scanner input){
        System.out.println("Do you want to exit?");
        String exit = input.next();
    }


    }


