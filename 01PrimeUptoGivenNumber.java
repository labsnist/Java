import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        int i, j, n, count = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");
        n = s.nextInt ();
        System.out.println("The prime numbers upto" + n + "are...");
        for (j = 2; j <= n; j++)
        {
            for (i = 1, count = 0; i <= j; i++)
            {
                if (j % i == 0)
                {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.print ("\t" + j);
            }
        }
    }
}
