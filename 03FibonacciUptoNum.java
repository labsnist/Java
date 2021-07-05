import java.util.Scanner;
class Fibo
{
    public static void main(String args[])
    {
        int a=0,b=1,c=1,n;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number upto which fibonacci series is to be printed:");
        n= s.nextInt();
        System.out.print(a+"\t"+b);
        do
        {
            System.out.print("\t"+c);
            a=b;
            b=c;
            c=a+b;
        }while(c<=n);
    }
}
