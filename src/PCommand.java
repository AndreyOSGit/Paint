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

import PCommand.ActionPress.ActionDragged;
import PCommand.PBP.ActionColor;
import PCommand.PBP.ActionWidth;


// реализует все наши листнеры
// содержит бизнеслогику и привинчивает её к юаю
public class PCommand
{


	PData data;

	ActionColor aColor;
	ActionWidth aWidth;	
	ActionPressed aPress;
	ActionDragged aDagged;
	ActionSave aSave;
	ActionLoad aLoad;
	
	private int x = 0; 
	private int y = 0;
	
	private static PCommand instance = null;
	
	private PCommand() 
	{
		data = PData.getInstance();
		aColor = new ActionColor();
		aWidth = new ActionWidth();
		aPress = new ActionPressed();
		aDagged = new ActionDragged();
	}
	
	public static PCommand getInstance() 
	{
		if (instance == null)
		{
			instance = new PCommand();
		}
		
		return instance;
	}
	
	class ActionSave implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {

			
			
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
//			IPaintComponent pan = new (IPaintComponent) e.getComponent();
//			pan.drawLine(x, y, x2, y2, data.width, data.color);
			
//			x = x2;
//			y = y2;
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class ActionDragged implements MouseMotionListener
	{
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			
			int	x2 = e.getX();
			int	y2 = e.getY();
			PPan pan = (PPan) e.getComponent();
			pan.drawLine(x, y, x2, y2, data.width, data.color);
			
//			Graphics2D gg = (Graphics2D) bi.getGraphics();
//			gg.setColor( data.color);
//			gg.setStroke(new BasicStroke( data.width ));
//			gg.drawLine(x1, y1, x2, y2);
			
			x = x2;
//			gg.setColor(x);
			y = y2;
//			repaint();
			
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			
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
				data.color = Color.RED;
				break;
			case "blue": 
				data.color = Color.BLUE;
				break;
			case "black": 
				data.color = Color.BLACK;
				break;
			}
		
		}
	}

//	public void paint(Graphics g)
//	{
//		super.paint(g);
//		
//		Graphics2D gg = (Graphics2D) g;
//		gg.drawImage(bi, null, 0, 0);
//	}
	
	class ActionWidth implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String width =   e.getActionCommand();
			System.out.println(width);
			switch (width) 
			{
			case "th1": 
				data.width = 1;
				break;
			case "th5":
				data.width = 5;
				break;
			case "th10":
				data.width = 10; 
				break;
			}
		}
	}
	
	
	
	
	public void SaveToFile(ActionEvent e)
	{
		try {
	
			    BufferedImage bi = (BufferedImage)e.getSource();;
			    File FileToSave = new File("C:\\saved.png");
			    ImageIO.write(bi, "jpg", FileToSave);
		
		}catch (IOException fileSave) {}
	}
	
	public void LoadFromFile(ActionEvent e)
	{

		try {
			
			File FileToLoad = new File("");
			
		} catch(IOException fileLoad) {}
		
	}

	
}

