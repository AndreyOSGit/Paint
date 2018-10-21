import java.awt.Color;
import java.awt.Graphics;

public interface IPaintComponent 
{

	public void drawLine(int x1, int y1, int x2, int y2, int width, Color clr);
	
	public void paint(Graphics g);

}
