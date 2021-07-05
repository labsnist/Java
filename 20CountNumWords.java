import java.util.Scanner;
class CountWords
{
  public static void main(String args[])
  {
    String s;
    int count=1,l;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    s=sc.nextLine();
    l=s.length();
    for(int i=0;i<l;i++)
    {
       if(s.charAt(i)==' ')
	  count++;
    }
    System.out.println("Number of words:"+count);
  }
}
