import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="AdapterDemo" width=300 height=100>
</applet>
*/
public class AdapterDemo extends Applet
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMotionAdapter(this));
	}
}
class MyMouseAdapter extends MouseAdapter
{
	AdapterDemo adapterDemo;
	public MyMouseAdapter(AdapterDemo adapterDemo)
	{
		this.adapterDemo = adapterDemo;
	}
	public void mouseClicked(MouseEvent me)
	{
		adapterDemo.showStatus("Mouse Clicked");
	}
}
class MyMouseMotionAdapter extends MouseMotionAdapter
{
	AdapterDemo adapterDemo;
	public MyMouseMotionAdapter(AdapterDemo adapterDemo)
	{
		this.adapterDemo = adapterDemo;
	}
	public void mouseDragged(MouseEvent me)
	{
		adapterDemo.showStatus("Mouse Dragged");
	}
}
