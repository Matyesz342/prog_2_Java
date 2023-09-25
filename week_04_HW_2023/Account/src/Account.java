import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }
    public Account()
    {
        this.id = 0;
        this.balance = 0;
        this.dateCreated = new Date();
    }
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public static double getAnnualInterestRate()
    {
        return Account.annualInterestRate;
    }
    public static void setAnnualInterestRate(double annualInterestRate)
    {
        Account.annualInterestRate =annualInterestRate;
    }
    public Date getDateCreated()
    {
        return this.dateCreated;
    }
    public static double getMonthlyInterestRate()
    {
        return Account.annualInterestRate;
    }
    public void deposit(double money)
    {
        this.balance += money;
    }
    public void withdraw(double money)
    {
        this.balance = this.balance - money;
    }
}
