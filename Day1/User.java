import java.util.Scanner;

public class User
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
     
        Bank bank=new Bank();
        int balance=0;
       
      
      
        int amount=0;
        System.out.println("a. Display Balance\nb. Withdraw\nc. Deposite");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:  balance=bank.displayBalance();
                        break;
            case 2 :    System.out.print("Enter amount : ");
                        amount=sc.nextInt();
                       balance=bank.withdraw(amount);
                       break;
            case 3 :   System.out.print("Enter amount : ");
                        amount=sc.nextInt();
                       balance=bank.deposite(amount);
                     break;
            default : System.out.println("invalid choice");
                        return;
        }
        
        System.out.println("Updated balance = "+balance);
        sc.close();

    }
}