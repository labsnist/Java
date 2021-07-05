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
     Resistor calculateSeriesResistance(Resistor r1,Resistor r2)
     {
	Resistor r=new Resistor();
	r.resistance =r1.resistance+r2.resistance;
	return r;
     }
}
class ParallelCircuit extends Resistor
{
      Resistor calculateParallelResistance(Resistor r1,Resistor r2)
     {
 	Resistor r=new Resistor();
	r.resistance =((r1.resistance*r2.resistance)/(r1.resistance+r2.resistance));
	return r;
     }
}
class ResistorExecuteA
{
     public static void main(String args[])
    {
	Resistor r=new Resistor();
	r.displayData();
	Resistor r1=new Resistor(1.74);
	r1.displayData();
  Resistor r2=new Resistor();
  r2.giveData(10.2);
  r2.displayData();
  SeriesCircuit s= new SeriesCircuit();
  r=s.calculateSeriesResistance(r1,r2);
 System.out.println("Series "); 
 r.displayData();
 ParallelCircuit p=new ParallelCircuit();
 r=p.calculateParallelResistance(r1,r2);
 System.out.println("Parallel "); 
 r.displayData();
   }
}
