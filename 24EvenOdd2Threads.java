class MyThread extends Thread
{
  public void run() 
  {
    System.out.println(" \t\t\tOdd thread is running");
    try
    {
      for(int i=1;i<=10;i=i+2)
      {  
        Thread.sleep(1000);
        System.out.println("\t\t\t\t"+i);
      }
    } 
    catch(InterruptedException e) 
    {System.out.println(e); }
    System.out.println("\t\t\tExit from Odd Thread");
  }
}
class  EvenOddThread
{
  public static void main(String args[ ]) throws InterruptedException
  {
    System.out.println("Event thread is running");
    MyThread t = new MyThread();
    t.start();
    for(int i=2;i<=10;i=i+2)
    {
      Thread.sleep(1000);
      System.out.println(i);
    }
    System.out.println("Exit from Event Thread");	 
  }
}
