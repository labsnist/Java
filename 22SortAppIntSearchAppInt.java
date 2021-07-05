package sortapp;
public interface SortInterface
{
   void sort();
}
-----------------------
package sortapp.subsortapp;
import sortapp.*;
public class SortImpl implements SortInterface
{
  public void sort()
  {
    System.out.println("Linear sort  is used...");
  }
}
-----------------------
package searchingapp;
public interface SearchInterface
{
  void search();
}
----------------------------
package searchingimpl;
import searchingapp.*;
public class SearchImpl implements SearchInterface
{
  public void search()
  {
   System.out.println("Linear search is used...");
  }
}
----------------------------
import sortapp.subsortapp.*;
import searchingimpl.*;
class ExecutePackage
{
     public static void main(String args[])
    {
	SortImpl s=new SortImpl();
	s.sort();
	SearchImpl p=new SearchImpl();
	p.search();
     }
}
