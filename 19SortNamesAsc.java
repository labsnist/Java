import java.util.Scanner;
class SortingNames
{
   public static void main(String args[])
   {
      String s[]=new String[10];
      String temp="";
      int n,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.print("How many strings u want to sort:");
      n=sc.nextInt();
      System.out.println("Enter "+n+" strings");
      for(i=0;i<n;i++)
      {
	s[i]=sc.next();
      }
      for(i=0;i<5;i++)
      {
        for(j=i+1;j<4;j++)
	{
	  if(s[i].compareTo(s[j])>=0)
	  {
	     temp=s[i];
	     s[i]=s[j];
	     s[j]=temp;
	  }
	}
      }
      System.out.println("Sorted strings are...");
      for(i=0;i<n;i++)
	System.out.print(s[i]+"-");
   }
}
