class BankAccount
{
    String name;
    long accno;
    String acctype;
    double balance;
    static int count;
    BankAccount()
    {
        name="Krishna";
        accno=987654;
        acctype="savings";
        balance=2020125.50;
        count++;
    }
    BankAccount(String n,long an,String at,double b)
    {
        name=n;
        accno=an;
        acctype=at;
        balance=b;
        count++;
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
    void noAccountHolders()
    {
        System.out.println("Number of account holders are:"+count);
    }
}
class ExecuteAccountB
{
    public static void main(String args[])
    {
        BankAccount acc1=new BankAccount();
        acc1.noAccountHolders();
        BankAccount acc2=new BankAccount("Sree",56786,"Current",12390.0);
        acc2.noAccountHolders();
    }
}
