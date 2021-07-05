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
        acctype="Savings";
        balance=2020125.50;
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
class ExecuteAccountA
{
    public static void main(String args[])
    {
        BankAccount acc1=new BankAccount();
        System.out.println("Using default constructor");
        acc1.display();
        BankAccount acc2=new BankAccount("Sree",56786,"Current",12390.0);
        System.out.println("Using Parameter constructor");
        acc2.display();
        Double amount;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the amount to be deposited:");
        amount=s.nextDouble();
        acc2.deposit(amount);
        System.out.print("Enter the amount to be withdrawn:");
        amount=s.nextDouble();
        acc2.withdraw(amount);
        acc2.display();
    }
}
