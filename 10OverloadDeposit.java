import java.util.Scanner;
class BankAccount
{
  String name;
  long accno;
  String acctype;
  double balance;
  BankAccount()
  {
    name="Krishna";
    accno=987654;
    acctype="savings";
    balance=2020125.50;
  }
  BankAccount(String n,long an,String at,double b)
  {
    name=n;
    accno=an;
    acctype=at;
    balance=b;
  }
  void deposit()
  {
     balance=balance+5000;
     System.out.println("Balance is:"+balance);
  }
  void deposit(double amount)
  {
     balance=balance+amount;
     System.out.println("Balance is:"+balance);
  }
  void withdraw(double amount)
  {
     if(amount>balance)
       System.out.println("Insufficient funds...");
     else 
     {
       balance=balance-amount;
       System.out.println("Balance is:"+balance);
     }
   }		
   void display()
   {
     System.out.println("Account details are...");
     System.out.println(name+"-"+accno+"-"+acctype+"-"+balance);
   }
}
class ExecuteAccountF
{
  public static void main(String args[])
  {
     BankAccount acc1=new BankAccount();
     acc1.display();	
     acc1.deposit();
     BankAccount acc2=new BankAccount();
     acc2.display();
     Double amount;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter the amount to be deposited:");
     amount=s.nextDouble();
     acc2.deposit(amount);
  }
}
