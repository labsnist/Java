interface GeometricShape
{
   void area();
   void perimeter();
}
class Triangle implements GeometricShape
{
   int height,base,side1,side2,side3;
   Triangle()
   {
     height=15;
     base=7;
     side1=5;
     side2=10;
     side3=6;
   }
   public void area()
   {
     double area=0.5*height*base;
     System.out.println("Area of the Triangle is:"+area);
   }
   public void perimeter()
   {
     int perimeter=side1+side2+side3;
     System.out.println("Perimeter of the Triangle is:"+perimeter);
   }
}
class Rectangle implements GeometricShape
{
   int length,breadth;
   Rectangle()
   {
     length=10;
     breadth=20;    
   }
   public void area()
   {
     double area=length*breadth;
     System.out.println("Area of the Rectangle is:"+area);
   }
   public void perimeter()
   {
     int perimeter=2*(length+breadth);
     System.out.println("Perimeter of the Rectangle is:"+perimeter);
   }
}
class Circle implements GeometricShape
{
   double radius;
   Circle()
   {
     radius=1.2; 
   }
   public void area()
   {
     double area=3.14*radius*radius;
     System.out.println("Area of the Circle is:"+area);
   }
   public void perimeter()
   {
     double perimeter=2*3.14*radius;
     System.out.println("Perimeter of the Circle is:"+perimeter);
   }
}
class ExecuteMain
{
   public static void main(String args[])
   {
     Triangle t=new Triangle();
     t.area();
     t.perimeter();
     Rectangle r=new Rectangle();
     r.area();
     r.perimeter();
     Circle c=new Circle();
     c.area();
     c.perimeter();
   }
}
