import java.util.Scanner;
class Roots
{
    public static void main(String args[])
    {
        int a, b, c;
        double d,k1, k2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the coefficients of x^2 , x and constant");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = (b * b)-(4 * a * c);
        if(d > 0)
        {
            System.out.println ("roots are real and unequal");
            k1 = (-b) + Math.sqrt (d) / (2 * a);
            k2 = (-b) - Math.sqrt (d) / (2 * a);
            System.out.println ("roots are " + k1 + "\t" + k2);
        }
        else if(d == 0)
        {
            System.out.println ("roots are real and equal");
            k1 = (-b) / (2 * a);
            System.out.println ("roots are " + k1 + "\t" + k1);
        }
        else
        {
            System.out.println ("roots are imaginary");
        }
    }
}
