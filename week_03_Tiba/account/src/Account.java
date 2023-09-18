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
}
