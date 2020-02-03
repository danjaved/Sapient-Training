public class Bank
{
    public static int balance=3_50_000;
    int displayBalance()
    {
        return balance;
    }
    int withdraw(int amount)
    {
        if(amount>balance)
        {System.out.println("Insufficient Balance");
        return balance;
        }
        else
        {
            balance-=amount;
           return balance;
        }

    }
    int deposite(int amount)
    {
        balance+=amount;
        return balance;
    }
}

