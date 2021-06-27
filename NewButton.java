import java.awt.*;
import java.awt.event.*;
public class NewButton extends Frame implements ActionListener
{
	Button rb;														// three Button reference variables
	public NewButton()												// constructor to set the properties to a button
	{
		FlowLayout fl = new FlowLayout();								// set the layout to frame
		setLayout(fl);
		rb = new Button("Red");										// convert reference variables into objects
		rb.addActionListener(this);										// link the Java button with the ActionListener
		add(rb);														// add each Java button to the frame
		setTitle("Button in Action");
		setSize(300, 350);												// frame size, width x height
		setVisible(true);									// to make frame visible on monitor, default is setVisible(false)
	}
	// override the only abstract method of ActionListener interface
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();								// to know which Java button user clicked
		System.out.println("You clicked " + str + " button");				// just beginner's interest
		if(str.equals("Red"))
		{
			setBackground(Color.red);
		}
	}
	public static void main(String args[])
	{
		new NewButton();								// anonymous object of ButtonDemo just to call the constructor
	}													// as all the code is in the constructor
}


