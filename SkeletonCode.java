public class SkeletonCode
{
    boolean moneyTransfered;
    double withdrawAmount;
    double totalFunds;
    double remainingFunds = totalFunds - withdrawAmount;

    public static void main(String[] args)
    {

    }
   
    /* User inputs the amount to be withdrawn and the accountID number for the recipient of the payment*/
    public boolean transferFunds(double withdrawAmount, int accountID)
    {
        /* The withdrawnAmount is withdrawn from the sending account's totalFunds, leaving the remainingFunds*/
        /* Needs if statement to determine if selected amount to transfer is present within account*/
        /* AccountID is needed to determine who recieves the money and if recieving account exists*/
        return moneyTransfered; 
        /* Boolean T/F determines is amount was successfully transfered or not */
    }
   
    /* User checks the Balane of their account*/
    public double checkBalance()
    {
        return totalFunds;
        /* Customer can check the balance of the Account*/
        /* Since customers can have multiple accounts, must be able to differentiate between accounts*/
    }
   
    /* User is able to print a reciept of transactions made on ATM Subsystem */
    public void printReciept()
    {
        /* Nothing is returned since the user is recieveing a summary of their activities*/
        /* printReciept would show the user every transaction they completed through the ATM Subsytem*/
    }
}