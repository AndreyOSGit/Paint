import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

// реализует все наши листнеры
// содержит бизнеслогику и привинчивает её к юаю
public class PCommand
{

	ActionColor aColor;
	ActionWidth aWidth;	
	ActionPressed aPress;
	ActionDragged aDagged;
	ActionSave aSave;
	ActionLoad aLoad;
	ActionAddTab aAddTab;
	ActionDelTab aDelTab;
	
	private int x = 0; 
	private int y = 0;
	private PData data;

	MyJTabbedPanel tablePanel;
	
	private static PCommand instance = null;
	
	private PCommand() 
	{
		data = PData.getInstance();
		aColor = new ActionColor();
		aWidth = new ActionWidth();
		aPress = new ActionPressed();
		aDagged = new ActionDragged();
		aSave = new ActionSave();
		aLoad = new ActionLoad();
		aAddTab = new ActionAddTab();
		aDelTab = new ActionDelTab();
		
		
	}
	
	public static PCommand getInstance() 
	{
		if (instance == null)
		{
			instance = new PCommand();
		}
		
		return instance;
	}
	

	class ActionLoad
	{
		
	}
	
	
	
	class ActionPressed implements MouseListener
	{
	
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			
			
		}
	}
	
	class ActionDragged implements MouseMotionListener
	{
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			
			int	x2 = e.getX();
			int	y2 = e.getY();
			IPaintComponent pan = (IPaintComponent) e.getSource();
			pan.drawLine(x, y, x2, y2, data.getWidth(), data.getColor());
			x = x2;
			y = y2;
			
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			
		}
	}
	
	
	class ActionTabPanel implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String TabAction =   e.getActionCommand();
			System.out.println(TabAction);
			switch (TabAction) 
			{
			case "AddTab": 
				tablePanel.addNewTab();
				break;
			case "DelTab": 
				tablePanel.deleteSelectedTab();
				break;
			}
		
		}
		
	}
		
	//p Command Дл актин листнеров 
	class ActionColor implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String color =   e.getActionCommand();
			System.out.println(color);
			switch (color) 
			{
			case "red": 
				data.setColor( Color.RED );
				break;
			case "blue": 
				data.setColor( Color.BLUE );
				break;
			case "black": 
				data.setColor( Color.BLACK );
				break;
			}
		
		}
	}


	
	class ActionWidth implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String width =   e.getActionCommand();
			System.out.println(width);
			switch (width) 
			{
			case "th1": 
				data.setWidth( 1 );
				break;
			case "th5":
				data.setWidth( 5 );
				break;
			case "th10":
				data.setWidth( 10 ); 
				break;
			}
		}
	}
	
	class ActionSave implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}	

//	class ActionSave implements ActionListener, MouseListener{
//	
//		@Override
//		public void actionPerformed(ActionEvent p) 
//		{
////			String width =   e.getActionCommand();
//			try {
//				
//			    BufferedImage bi = (BufferedImage)p.getSource();
//			    File FileToSave = new File("C:\\saved.png");
//			    ImageIO.write(bi, "jpg", FileToSave);
//		
//		}catch (IOException fileSave) {}
//		}
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//
//				actionPerformed(ActionEvent p);
//				
//			}
//
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		}
//
//		public void saveToFile(ActionEvent e)
//		{
//			try {
//		
//				    BufferedImage bi = (BufferedImage)e.getSource();
//				    File FileToSave = new File("C:\\saved.png");
//				    ImageIO.write(bi, "jpg", FileToSave);
//			
//			}catch (IOException fileSave) {}
//		}
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	
//	}
	

	
	
	public void loadFromFile(ActionEvent e)
	{

//		try {
//			
//			File FileToLoad = new File("");
//			
//		} catch(IOException fileLoad) {}
		
	}

	
}

