public class BankAccount 
{
    private int balance=10_000;
    private Address address;
    private AccountType accountType;
    private long accountId;
    private static long INITIAL_ACCOUNT_ID_VALUE=10_000;


    BankAccount (AccountType accountType,int amount, Address address)
    {
        if(amount>10_000)
        balance=amount;
        this.address=address;
        this.accountType=accountType;
        this.accountId=++ INITIAL_ACCOUNT_ID_VALUE;

    }
    BankAccount (AccountType accountType, Address address)
    {
        this.address=address;
        this.accountType=accountType;
        this.accountId=++ INITIAL_ACCOUNT_ID_VALUE;


    }
    public void displayDetails()
    {
        System.out.println(this.balance);
        System.out.println(this.accountId);
        this.address.showAddress();
    }
    public void updateAddress(Address address)
    {
        this.address=address;
    }
  
    int displayBalance()
    {
        return this.balance;
    }
    int withdraw(int amount)
    {
        switch(this.accountType)
        {
            case CURRENT_ACCOUNT :if(balance-amount<20_000)
                                     {
                                         System.out.println("Insufficient Balance");
                                        return this.balance;
                                     }
                                    else
                                   {
                                    this.balance-=amount;
                                    return this.balance;
                                    }
            case SALARIED_ACCOUNT : if(balance<amount)
                                        {
                                            System.out.println("Insufficient Balance");
                                        return this.balance;
                                     }
                                    else
                                    {
                                    this.balance-=amount;
                                    return this.balance;
                                    }                            
                                   
            case SAVINGS_ACCOUNT : if(balance-amount<10_000)
                                        {
                                            System.out.println("Insufficient Balance");
                                            return this.balance;
                                        }
                                    else
                                    {
                                        this.balance-=amount;
                                        return this.balance;
                                    }                                                          
                                   
            default : System.out.println("Invalid account type");
        }

        return this.balance;

    }
    int deposite(int amount)
    {
        this.balance+=amount;
        return this.balance;
    }
}

