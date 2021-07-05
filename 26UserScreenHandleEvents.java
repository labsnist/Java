import java.awt.*;
import java.awt.event.*;
class ScreenDesign extends Frame implements ActionListener
{
  TextField t1,t2,t3;
  ScreenDesign()
  {
   super("Design Screen");
   setLayout(new FlowLayout(FlowLayout.LEFT,20,5));
   Label l1=new Label("First Number");
   t1=new TextField(10);
   Label l2=new Label("Second Number");
   t2=new TextField(10);
   Label l3=new Label("Result");
   t3=new TextField(10);
   Button a=new Button("ADD");
   Button s=new Button("SUBTRACT");
   add(l1);
   add(t1);
   add(l2);
   add(t2);
   add(l3);
   add(t3);
   add(a);
   add(s);
   a.addActionListener(this);
   s.addActionListener(this);
   setSize(250,250);
   setVisible(true);
  }
  public void actionPerformed(ActionEvent ae)
  {
   int temp;
   if(ae.getActionCommand().equals("ADD"))   
    temp=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
   else
    temp=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
   t3.setText(temp+" ");
  }
  public static void main(String args[])
  {
   new ScreenDesign();
  }
}
