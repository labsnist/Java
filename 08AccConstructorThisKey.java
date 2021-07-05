package com.company;

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
    BankAccount(String name,long accno,String acctype,double balance)
    {
        this.name=name;
        this.accno=accno;
        this.acctype=acctype;
        this.balance=balance;
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
class ExecuteAccountD
{
    public static void main(String args[])
    {
        BankAccount acc=new BankAccount("Sree",56786,"Current",12390.0);
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
