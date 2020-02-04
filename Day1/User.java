import java.util.Scanner;

public class User
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
     
        BankAccount BankAccount=new BankAccount();
        int balance=0;
       
      
      
        int amount=0;
        System.out.println("a. Display Balance\nb. Withdraw\nc. Deposite");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:  balance=BankAccount.displayBalance();
                        break;
            case 2 :    System.out.print("Enter amount : ");
                        amount=sc.nextInt();
                       balance=BankAccount.withdraw(amount);
                       break;
            case 3 :   System.out.print("Enter amount : ");
                        amount=sc.nextInt();
                       balance=BankAccount.deposite(amount);
                     break;
            default : System.out.println("invalid choice");
                        return;
        }
        
        System.out.println("Updated balance = "+balance);
        sc.close();

    }
}