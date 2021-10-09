public class Transaction 
{
    private String date;
    private String time;
    private String transactionType;

    public Transaction(String date, String time, String transactionType) //These are the variables we need to make our methods work
    {
        this.date = date;
        this.time = time;
        this.transactionType = transactionType;
    }
}
