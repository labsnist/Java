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
class Override 
{
public static void main(String args[])
{
	Resistor r=new Resistor();
	r.displayData();
	SeriesCircuit s= new SeriesCircuit();
	s.displayData();
	ParallelCircuit p=new ParallelCircuit();
	p.displayData();
}
}
