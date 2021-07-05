import java.util.Scanner;
class Resistor
{
    double resistance;
    Resistor()
    {
	resistance=2.35;
    }
    Resistor(double r)
   {
	resistance=r;
   }
   void giveData(double r)
   {
	resistance=r;
   }
   void displayData()
   {
	System.out.println("Resistance is:"+resistance);
   }
}
class SeriesCircuit extends Resistor
{
     Resistor calculateSeriesResistance(Resistor r1[])
     {
	Resistor r=new Resistor();
	r.resistance=0;
	for(int i=0;i<5;i++)
	{
	     r.resistance +=r1[i].resistance;
       }
       return r;
   }
}
class ParallelCircuit extends Resistor
{
      Resistor calculateParallelResistance(Resistor r1[])
     {
 	Resistor r=new Resistor();
	r.resistance=0;
	for(int i=0;i<5;i++)
	{
	     r.resistance +=1/r1[i].resistance;
	}
	r.resistance=1/ r.resistance;
	return r; 
     }
}
class ResistorExecuteB
{
     public static void main(String args[])
    {
	Resistor r=new Resistor();
	Scanner s=new Scanner(System.in);
           Resistor resistancearray[]=new Resistor[5];
	for(int i=0;i<5;i++)
	{
	    resistancearray[i]=new Resistor();
	    System.out.println("Enter resistance:");
              Double rs=s.nextDouble();
              resistancearray[i].giveData(rs);
	}
	SeriesCircuit s= new SeriesCircuit();
	r=s.calculateSeriesResistance(resistancearray);
	System.out.println("Series ");
         R.displayData();
         ParallelCircuit p=new ParallelCircuit();
         r=p.calculateParallelResistance(resistancearray);
         System.out.println("Parallel ");
         r.displayData();
    }
}
