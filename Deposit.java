public class Deposit
{
    public double deposit(double deposit, double balance){
        if(deposit<=0)
            return balance;
        balance = balance + deposit;
        return balance;
    }
}