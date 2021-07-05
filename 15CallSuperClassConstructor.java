class A
{
  int i,j;
  A(int ii,int jj)
  {
    i=ii; 
    j=jj;
  }
}
class B extends A
{
  int k;
  B(int ii,int jj,int kk)
  {
    super(ii,jj);
    k=kk;
  }
  void sum()
  {
    System.out.println("Sum of i+j+k is "+(i+j+k));
  }
}
class Super1
{
  public static void main(String args[])
  {
    B subObj=new B(10,20,40);
    subObj.sum();
  }
}
