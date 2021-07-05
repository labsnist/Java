class Resistor
{
	void displayData()
	{
 	       System.out.println("In Resistor class");
	}
}
class SeriesCircuit extends Resistor
{
	void displayData()
	{
            System.out.println("In SeriesCircuit class");
	}
}
class ParallelCircuit extends Resistor
{
void displayData()
{
 	System.out.println("In ParallelCircuit class ");
}
}
class DMD 
{
public static void main(String args[])
{
	Resistor r=new Resistor();
	SeriesCircuit s= new SeriesCircuit();
	ParallelCircuit p=new ParallelCircuit();
      Resistor r1=new Resistor();
      r=r1;
      r.displayData();
      r=s;
      r.displayData();
      r=p;
      r.displayData();
}
}
