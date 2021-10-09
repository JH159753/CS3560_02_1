public class Account 
{
    private int accountID;
    private double balance;
    private int pin;

    public Account(int accountID, double balance, int pin) //these are the variables wwe need to access to make our methods work
    {
        this.accountID = accountID;
        this.balance = balance;
        this.pin = pin;
    }
}
