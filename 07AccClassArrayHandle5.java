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
        System.out.println(name+"-"+accno+"-"+acctype+"-"+balance);
    }
}
class ExecuteAccountC
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String name,type;
        long no;
        double bal;
        BankAccount ba[]=new BankAccount[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Account name,no,type and balance");
            name=s.next();
            no=s.nextLong();
            type=s.next();
            bal=s.nextDouble();
            ba[i]=new BankAccount(name,no,type,bal);
        }
        System.out.println("Account holders details are");
        for(int i=0;i<5;i++)
        {
            ba[i].display();
        }
    }
}
