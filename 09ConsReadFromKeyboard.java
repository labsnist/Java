import java.util.Scanner;
class BankAccount
{
    String name;
    long accno;
    String acctype;
    double balance;
    BankAccount()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name,accountno,accounttype and balance");
        name = s.next();
        accno=s.nextLong();
        acctype=s.next();
        balance=s.nextDouble();
    }
    BankAccount(String n,long an,String at,double b)
    {
        name=n;
        accno=an;
        acctype=at;
        balance=b;
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
class ExecuteAccountE
{
    public static void main(String args[])
    {
        BankAccount acc=new BankAccount();
        acc.display();
        Double amount;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the amount to be deposited:");
        amount=s.nextDouble();
        acc.deposit(amount);
        System.out.print("Enter the amount to be withdrawn:");
        amount=s.nextDouble();
        acc.withdraw(amount);
        acc.display();
    }
}
