public class BankAccountClient
{
    public static void main(String[] args) {
        Address address1=new Address("147","8thBlock,5th Cross, Sakshinagar","Pune","277172");
        Address address2=new Address("202","4thBlock,18th Cross, Jayanagar","Banglore","577142");
        BankAccount bank1=new BankAccount(AccountType.SAVINGS_ACCOUNT, 20_000,address1);
        BankAccount bank2=new BankAccount(AccountType.SALARIED_ACCOUNT , address2);

        bank1.displayDetails();
    }
}