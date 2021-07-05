import java.util.Scanner;
class Palindrome
{
   public static void main(String args[])
   {
      String s,d="";
      int l;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string:");
      s=sc.next();     //s=sc.nextLine(); 
      l=s.length();
      for(int i=l-1;i>=0;i--)
      {
	  d=d+s.charAt(i);
      }
      if(s.equals(d))
	System.out.println("String is palindrome");
      else
	System.out.println("String is not palindrome");		
   }
}
