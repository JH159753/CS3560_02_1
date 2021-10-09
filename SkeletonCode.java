public class SkeletonCode 
{
    double withdrawAmount;
    double depositAmount;
    public static void main(String[] args)
    {

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
