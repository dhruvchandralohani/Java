/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Mouse" width=500 height=500>
</applet>
*/
public class MouseEvents extends Applet
implements MouseListener,MouseMotionListener
{
	int X=0,Y=20;
	String msg="MouseEvents";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.black);
		setForeground(Color.red);
	}
	public void mouseEntered(MouseEvent m)
	{
		setBackground(Color.magenta);
		showStatus("Mouse Entered");
		repaint();
	}
	public void mouseExited(MouseEvent m)
	{
		setBackground(Color.black);
		showStatus("Mouse Exited");
		repaint();
	}
	public void mousePressed(MouseEvent m)
	{
		X=10;
		Y=20;
		msg="Mouse is pressed";
		setBackground(Color.green);
		repaint();
	}
	public void mouseReleased(MouseEvent m)
	{
		X=10;
		Y=20;
		msg="You released the mouse";
		setBackground(Color.blue);
		repaint();
	}
	public void mouseMoved(MouseEvent m)
	{
		X=m.getX();
		Y=m.getY();
		msg="You are moving the mouse";
		setBackground(Color.white);
		showStatus("Mouse Moved");
		repaint();
	}
	public void mouseDragged(MouseEvent m)
	{
		msg="You are dragging the mouse";
		setBackground(Color.yellow);
		showStatus("Mouse Dragged"+m.getX()+" "+m.getY());
		repaint();
	}
	public void mouseClicked(MouseEvent m)
	{
		msg="You clicked the mouse";
		setBackground(Color.cyan);
		showStatus("Mouse Clicked");
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
	}
}

