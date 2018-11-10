import java.awt.Color;

import javax.swing.JTabbedPane;

public class MyJTabbedPanel extends JTabbedPane
{
	
	PCommand cmd = PCommand.getInstance();
	
	public MyJTabbedPanel()
	{	
	}
	
	public MyJTabbedPanel(PCommand cmd)
	{
		setBackground(Color.green);
		setBounds(0, 10 , 600, 600);
		addTab();
		setVisible(true);
	}
	
	public void addNewTab()
	{
		PPan pp = new PPan(cmd); 
		add(new PPan());
		
	}

	public void deleteSelectedTab()
	{
		
	}
	
}
