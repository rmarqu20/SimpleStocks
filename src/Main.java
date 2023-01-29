import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Stock newStock = new Stock();
        System.out.println("Welcome, please choose an option below");
        String input;
        Boolean flag = true;
        while (Boolean.TRUE.equals(flag))
        {
            System.out.println("A. Buy stock");
            System.out.println("B. Sell stock");
            System.out.println("C. View stock");
            System.out.println("D. Quit");
            input = scan.next();
            switch (input.toLowerCase())
            {
                case "a":
                    System.out.println("Please enter the name of the stock you would like to buy:");
                    String name = scan.next();
                    System.out.println("Please enter the price of the stock you would like to buy:");
                    double price = 0.0;
                    try
                    {
                        price = scan.nextDouble();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Invalid price");
                        break;
                    }
                    System.out.println("Please enter the amount of stock you would like to buy:");
                    int shares = 0;
                    try
                    {
                        shares = scan.nextInt();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Invalid amount");
                        break;
                    }
                    newStock.buy(name, price, shares);
                    break;
                case "b":
                    if(newStock.getShares() <= 0)
                    {
                        System.out.println("No Shares.");
                        break;
                    }
                    System.out.println("Please enter the price of the stock you would like to sell:");
                    double price2 = 0.0;
                    try
                    {
                        price2 = scan.nextDouble();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Invalid price");
                        break;
                    }
                    System.out.println("Please enter the amount of stock you would like to sell:");
                    int shares2 = 0;
                    try
                    {
                        shares2 = scan.nextInt();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Invalid amount");
                        break;
                    }
                    newStock.sell(price2, shares2);
                    break;
                case "c":
                    System.out.println("Stock Name: " + newStock.getName());
                    System.out.println("Stock Shares: " + newStock.getShares());
                    System.out.println("Stock Average Price: " + newStock.getAveragedPrice());
                    break;
                case "d":
                    flag = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Option. Please try again.");
                    break;
            }
        }
    }
}