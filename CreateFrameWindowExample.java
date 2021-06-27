import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class CreateFrameWindowExample extends Frame{
	CreateFrameWindowExample(String title)
	{
		super();
		this.setTitle(title);
		this.setSize(400,400);
		this.setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String args[])
	{
		CreateFrameWindowExample window = new CreateFrameWindowExample("Create Window Example");
	}
}

