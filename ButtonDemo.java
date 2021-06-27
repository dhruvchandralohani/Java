import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame implements ActionListener
{
  Button rb, gb, bb;		            // three Button reference variables
  public ButtonDemo()	                    // constructor to set the properties to a button
  {
    FlowLayout fl = new FlowLayout();	    // set the layout to frame
    setLayout(fl);

    rb = new Button("Red");		    // convert reference variables into objects
    gb = new Button("Green");
    bb = new Button("Blue");

    rb.addActionListener(this);		    // link the Java button with the ActionListener
    gb.addActionListener(this);
    bb.addActionListener(this);

    add(rb);			            // add each Java button to the frame
    add(gb);
    add(bb);   

    setTitle("Button in Action");
    setSize(300, 350);                      // frame size, width x height
    setVisible(true);			    // to make frame visible on monitor, default is setVisible(false)
  }
			                    // override the only abstract method of ActionListener interface
  public void actionPerformed(ActionEvent e)
  {
    String str = e.getActionCommand();	    // to know which Java button user clicked
    System.out.println("You clicked " + str + " button");  // just beginner's interest

    if(str.equals("Red"))
    {
      setBackground(Color.red);
    }
    else if(str.equals("Green"))
    {
      setBackground(Color.green);
    }
    else if(str.equals("Blue"))
    {
      setBackground(Color.blue);
    }
  }
  public static void main(String args[])
  {
    new ButtonDemo();                       // anonymous object of ButtonDemo just to call the constructor
  }			                    // as all the code is in the constructor
}

