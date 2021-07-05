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
  void setName(String n)
  {
    name = n;
  }
  String getName()
  {
    return name;
  }
  void setAccountNo(long an)
  {
    accno = an;
  }
  long getAccountNo()
  {
    return accno;
  }
  void setAccountType(String at)
  {
    acctype = at;
  }
  String getAccountType()
  {
    return acctype;
  }
  void setBalance(double ba)
  {
    balance = ba;
  }
  double getBalance()
  {
    return balance;
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
class ExecuteAccountG
{
  public static void main(String args[])
  {
     BankAccount acc=new BankAccount();
     acc.setName("Vignya");  
     acc.setAccountNo(123456);
     acc.setAccountType("Current");
     acc.setBalance(10000.90);
     System.out.println("Account details are...");
     System.out.println(acc.getName()+"-"+acc.getAccountNo()+"-"+acc.getAcco
     untType()+"-"+acc.getBalance());
     acc.deposit(1000);
     acc.withdraw(550);  
  }
}
