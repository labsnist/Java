class ThreadPriority 
{
  public static void main(String args[]) 
  {
   Thread t=Thread.currentThread();
   System.out.println("Current thread:"+t);
   //change the thread priority
   t.setPriority(Thread.MIN_PRIORITY);
   System.out.println("After Priority change:"+t);
   t.setPriority(Thread.NORM_PRIORITY);
   System.out.println("After Priority change:"+t);
   t.setPriority(Thread.MAX_PRIORITY);
   System.out.println("After Priority change:"+t);
  }
}
