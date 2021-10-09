public class SkeletonCode
{
    boolean moneyTransferred;
    double withdrawAmount;
    double totalFunds;
    double remainingFunds = totalFunds - withdrawAmount;
    double depositAmount;

    public static void main(String[] args)
    {

    }
   
    /* User inputs the amount to be withdrawn and the accountID number for the recipient of the payment*/
    public boolean transferFunds(double withdrawAmount, int accountID)
    {
        /* The withdrawnAmount is withdrawn from the sending account's totalFunds, leaving the remainingFunds*/
        /* Needs if statement to determine if selected amount to transfer is present within account*/
        /* AccountID is needed to determine who recieves the money and if recieving account exists*/
        return moneyTransferred; 
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


    public double withdrawCash(double withdrawAmount) /*withdraw amount will be from user input, scanner variable*/
    {
        return withdrawAmount; //going to need if statements to confirm
    }
    public double depositCash(double depositAmount)
    {
        return depositAmount; //are if statements required for this method?
    }
    public double depositCheck(double depositAmount) //using same variable for deposit methods. 
    //going to need some way to confirm if the amount on the check is correct. Like a real ATM does
    {
        return depositAmount; /*both deposit methods need to reset depositAmount variable so that
                                they could deposit again in the future*/
    }
    
}

