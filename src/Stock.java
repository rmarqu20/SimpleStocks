public class Stock
{
    private String name;
    private int shares;
    private double price;
    private double capital;

    public void buy(String n, double p, int s)
    {
        name = n;
        shares += s;
        price = p;
        capital += s * p;
    }
    public void sell(double p, int s)
    {
        shares -= s;
        price = p;
        capital -= s * p;
    }
    public String getName()
    {
        return name;
    }
    public int getShares()
    {
        return shares;
    }
    public double getPrice()
    {
        return price;
    }
    public double getAveragedPrice()
    {
        return capital / getShares();
    }
}
