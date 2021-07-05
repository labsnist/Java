import java.util.Scanner;
class InsufficientFundException extends Exception 
{
  private String msg;
  InsufficientFundException(String m) 
  {
     msg=m;
  }
  public String toString() 
  {
    return "InsufficientFundException:" + msg;
  }
  public String  getMessage() { return msg;}
}
class BankAccount
{
  String name;
  long accno;
  String acctype;
  double balance;
  BankAccount()
  {
    name="Krishna";
    accno=9876546;
    acctype="Savings";
    balance=20200.50;
  }
  void withdraw(double amount)
  {
    try
    {
      if(balance-amount>=1000) //minimum balance is Rs.1000 
      {
        System.out.println("Balance before withdrawl:"+balance);
        balance=balance-amount;
        System.out.println("Balance after withdrawl:"+balance);
      }         
      else 
        throw new InsufficientFundException("Insufficient balance");
    }
    catch(InsufficientFundException e)
    {
      System.out.println("Caught "+e);
      System.out.println("Exception Description:"+e.getMessage()); 
    }
  }		
  void display()
  {
    System.out.println("Account details are...");
    System.out.println(name+"-"+accno+"-"+acctype+"-"+balance);
  }
}
class AccountException
{
  public static void main(String args[])
  {
    BankAccount a=new BankAccount();
    a.display();	
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the amount to be withdrawn:");
    double amount=s.nextDouble();
    a.withdraw(amount);
  }
}
